package chapter7.concurrent_collections.concurrent_linked_queue;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.ArrayDeque;

public class ZooManager {
  private Queue<Integer> queue = new ConcurrentLinkedQueue<>();
  //private Queue<Integer> queue = new ArrayDeque<>();
  public void offer(Integer integer) {
    queue.offer(integer);
    System.out.print(queue.peek()+" ");
    System.out.println(queue.poll());
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
      System.out.println("manager.queue:" + manager.queue);
      System.out.println("manager.queue.size():" + manager.queue.size());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
