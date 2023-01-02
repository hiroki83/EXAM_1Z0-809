package chapter7.concurrent_collections.concurrent_linked_deque;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.Deque;
import java.util.ArrayDeque;

public class ZooManager {
  private Deque<Integer> deque = new ConcurrentLinkedDeque<>();
  //private Deque<Integer> deque = new ArrayDeque<>();
  public void offer(Integer integer) {
    deque.offer(integer);
    deque.push(integer);
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
      System.out.println(manager.deque);
      System.out.println(manager.deque.size());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
