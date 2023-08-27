package bonus3.q48;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SaladBarTracker {
  public static void await(CyclicBarrier cb) {
    try {
      cb.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }
  }
  public static void main(String ... args) {
    CyclicBarrier cb = new CyclicBarrier(4, () -> System.out.println("salad bar empty")); // r1
    ExecutorService service = Executors.newFixedThreadPool(4); // r2
    for(int i = 0; i < 12; i++) {
      service.submit(() -> await(cb)); // r3
    }
    service.shutdown();
  }
}
