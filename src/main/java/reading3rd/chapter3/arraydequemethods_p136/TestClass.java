package reading3rd.chapter3.arraydequemethods_p136;

import java.util.Queue;
import java.util.ArrayDeque;

public class TestClass {
  public static void main(String ... args) {
    Queue<Integer> queue = new ArrayDeque<>();
    System.out.println(queue.offer(19));
    System.out.println(queue.offer(4));
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.peek());
  }
}
