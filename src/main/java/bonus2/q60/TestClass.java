package bonus2.q60;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {
  public static void main(String ... args) throws InterruptedException {
    AtomicInteger lion1 = new AtomicInteger(0);
    final int[] lion2 = {0};
    ExecutorService service = Executors.newCachedThreadPool(); // h1
    for (int i = 0; i < 1000; i++)
      //service.submit(() -> lion1++); // h2 DOES NOT COMPILE
      service.submit(() -> lion1.getAndIncrement()); // h2
    for (int i = 0; i < 1000; i++)
      service.submit(() -> lion2[0]++); // h3
    Thread.sleep(100);
    System.out.println(lion1 + " " + lion2[0]);
    if(service != null) service.shutdown();
  }
}
