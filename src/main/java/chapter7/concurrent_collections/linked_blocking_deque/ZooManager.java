package chapter7.concurrent_collections.linked_blocking_deque;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.ArrayDeque;

public class ZooManager {
  public void offer(Integer integer) {
    try {
      BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
      blockingDeque.offer(integer);
      blockingDeque.offerFirst(integer+10, 1, TimeUnit.SECONDS);
      blockingDeque.offerLast(integer+100, 1, TimeUnit.SECONDS);
      blockingDeque.offer(integer+1000, 1, TimeUnit.SECONDS);

      //System.out.println(blockingDeque.poll());
      System.out.println(blockingDeque.poll() + ", " + blockingDeque.poll(1, TimeUnit.MILLISECONDS)+", "+ blockingDeque.pollFirst(1, TimeUnit.SECONDS)+", "+blockingDeque.pollLast(1, TimeUnit.SECONDS));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(100);
      ZooManager manager = new ZooManager();
      for (int i = 0; i < 50; i++) {
        final int index = i;
        service.submit(() -> manager.offer(index));
      }
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
