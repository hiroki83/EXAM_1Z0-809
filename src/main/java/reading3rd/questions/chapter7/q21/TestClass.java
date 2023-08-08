package reading3rd.questions.chapter7.q21;

import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

public class TestClass {
  public void run() {
    Object o1 = new Object();
    Object o2 = new Object();
    ExecutorService service = Executors.newFixedThreadPool(2);
    Future<?> f1 = service.submit(() -> {
      synchronized (o1) {
        synchronized (o2) { System.out.println("Tortoise");}
      }
    });
    Future<?> f2 = service.submit(() -> {
      synchronized (o2) {
        synchronized (o1) { System.out.println("Hare");}
      }
    });
    try {
      f1.get();
      f2.get();
    } catch(InterruptedException | ExecutionException e ) {
      e.printStackTrace();
    }
    service.shutdown();
  }
}
