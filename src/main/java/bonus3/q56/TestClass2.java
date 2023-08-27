package bonus3.q56;

import java.util.Deque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingDeque;

public class TestClass2 {
  //public static void updateRecords(Deque<Integer> deque) throws InterruptedException {
  public static void updateRecords(BlockingDeque<Integer> deque) throws InterruptedException {
    deque.push(9);
    deque.push(8);
    deque.push(3);
    System.out.print(deque.pop());
    System.out.print(deque.pop());
    System.out.print(deque.pop());
  }
  public static void main(String ... args) throws InterruptedException {
    updateRecords(new LinkedBlockingDeque());
  }
}
