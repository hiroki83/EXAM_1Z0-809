package reading3rd.questions.chapter7.q14;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingDeque;

public class TestClass {
  public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
    deque.offer(103);
    deque.offerFirst(20, 1, TimeUnit.SECONDS);
    deque.offerLast(85, 7, TimeUnit.HOURS);
    System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
    System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));
  }
  public static void main(String ... args) throws InterruptedException {
    TestClass c = new TestClass();
    LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
    c.addAndPrintItems(deque);
  }
}
