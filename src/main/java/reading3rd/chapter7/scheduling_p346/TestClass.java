package reading3rd.chapter7.scheduling_p346;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public class TestClass {
  public static void main(String ... args) {
    ScheduledExecutorService service = null;
    try {
      service = Executors.newSingleThreadScheduledExecutor();
      Runnable task1 = () -> System.out.println("Hello Zoo");
      Callable<String> task2 = () -> "Monkey";

      Future<?> result1 = service.schedule(task1, 1, TimeUnit.SECONDS);
      Future<?> result2 = service.schedule(task2, 2, TimeUnit.SECONDS);
      System.out.println(result2.get());
    } catch(InterruptedException e) {
      e.printStackTrace();
    } catch(ExecutionException e) {
      e.printStackTrace();
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
