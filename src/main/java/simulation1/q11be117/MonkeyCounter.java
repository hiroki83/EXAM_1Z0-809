package simulation1.q11be117;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class MonkeyCounter {
  private static AtomicInteger monkey1 = new AtomicInteger(0); // m1
  private static AtomicLong monkey2 = new AtomicLong(0);

  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor(); // m2
      for (int i = 0; i < 100; i++)
        service.submit(() -> monkey1.getAndIncrement()); // m3
      for (int i = 0; i < 100; i++)
        service.submit(() -> monkey2.incrementAndGet());
      System.out.println(monkey1+" "+monkey2); // m4
      Thread.sleep(1);
      System.out.println(monkey1+" "+monkey2);
    } catch(InterruptedException e) {
      e.printStackTrace();
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
