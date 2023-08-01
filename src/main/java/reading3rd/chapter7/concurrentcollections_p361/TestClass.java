package reading3rd.chapter7.concurrentcollections_p361;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.Map;
import java.util.Queue;
import java.util.Deque;

public class TestClass {
  public static void main(String ... args) {
    Map<String, Integer> map = new ConcurrentHashMap<>();
    map.put("zebra", 52);
    map.put("elephant", 10);
    System.out.println(map.get("elephant"));

    Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    queue.offer(31);
    System.out.println(queue.peek());
    System.out.println(queue.poll());

    Deque<Integer> deque = new ConcurrentLinkedDeque<>();
    deque.offer(10);
    deque.push(4);
    System.out.println(deque.peek());
    System.out.println(deque.pop());
    System.out.println(deque.peek());
    System.out.println(deque.pop());
  }
}
