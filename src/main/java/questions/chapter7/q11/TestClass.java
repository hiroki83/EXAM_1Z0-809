package questions.chapter7.q11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class TestClass {
  public static void main(String ... args) throws InterruptedException, ExecutionException {
    Object o1 = new Object();
    Object o2 = new Object();
    ExecutorService service = Executors.newFixedThreadPool(2);
    Future<?> f1 = service.submit(() -> {
      synchronized (o1) {
        synchronized (o2) {System.out.println("Tortoise");} // t1
      }
    });
    Future<?> f2 = service.submit(() -> {
      synchronized (o2) {
        synchronized (o1) {System.out.println("Hare");} // t2
      }
    });
    f1.get();
    f2.get();
  }
}
