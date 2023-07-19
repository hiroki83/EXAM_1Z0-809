package bonus1.q60;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class TestClass {
  public static void main(String ... args) throws ExecutionException, InterruptedException {
    Object o1 = new Object();
    Object o2 = new Object();
    ExecutorService service = Executors.newSingleThreadExecutor();
    Future<?> f1 = service.submit(() -> {
      synchronized (o1) {
        synchronized (o2) { System.out.println("Fox");} // g1
      }
    });
    Future<?> f2 = service.submit(() -> {
      synchronized (o2) {
        synchronized (o1) { System.out.println("Hound");} // g2
      }
    });
    f1.get();
    f2.get();
    if(service != null) service.shutdown();
  }
}
