package bonus3.q56;

import java.util.Deque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingDeque;

public class TestClass {
  //public static void updateRecords(Deque<Integer> deque) throws InterruptedException {
  public static void updateRecords(BlockingDeque<Integer> deque) throws InterruptedException {
    deque.offerLast(9, 4, TimeUnit.DAYS);
    deque.offerFirst(8, 21, TimeUnit.MICROSECONDS);
    deque.offer(3);
    System.out.print(deque.pollFirst(3, TimeUnit.MILLISECONDS));
    System.out.println(" " + deque.pollLast(1, TimeUnit.SECONDS));
  }
  public static void main(String ... args) throws InterruptedException {
    updateRecords(new LinkedBlockingDeque());
  }
}
