package chapter7.concurrent_collections.linked_blocking_queue;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.ArrayDeque;

public class ZooManager {
  public void offer(Integer integer) {
    try {
      BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
      blockingQueue.offer(integer);
      blockingQueue.offer(integer, 1, TimeUnit.SECONDS);

      //System.out.println(blockingQueue.poll());
      System.out.println(blockingQueue.poll() + ", " + blockingQueue.poll(1, TimeUnit.MILLISECONDS));
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
