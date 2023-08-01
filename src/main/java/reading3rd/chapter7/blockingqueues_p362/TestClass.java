package reading3rd.chapter7.blockingqueues_p362;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestClass {
  public static void main(String ... args) {
    try {
      BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
      blockingQueue.offer(39);
      blockingQueue.offer(3, 4, TimeUnit.SECONDS);

      System.out.println(blockingQueue.poll());
      System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
