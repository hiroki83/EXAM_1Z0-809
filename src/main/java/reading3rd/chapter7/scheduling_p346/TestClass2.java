package reading3rd.chapter7.scheduling_p346;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestClass2 {
  public static void main(String ... args) {
    ScheduledExecutorService service = null;
    try {
      service = Executors.newSingleThreadScheduledExecutor();
      Runnable task1 = () -> System.out.println("task1");
      Runnable task2 = () -> System.out.println("task2");
      service.scheduleAtFixedRate(task1, 0, 1, TimeUnit.SECONDS);
      service.scheduleWithFixedDelay(task2, 0, 500, TimeUnit.MILLISECONDS);
      Thread.sleep(5000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    } finally {
      if (service != null) service.shutdown();
    }
  }
}
