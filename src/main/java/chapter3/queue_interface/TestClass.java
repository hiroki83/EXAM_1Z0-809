package chapter3.queue_interface;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    Queue<Integer> queue = new ArrayDeque<>();
    System.out.println(queue.offer(10));
    System.out.println(queue.offer(4));
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.peek());
  }
}
