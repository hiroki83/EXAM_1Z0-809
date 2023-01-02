package chapter7.scheduling;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(Runtime.getRuntime().availableProcessors());
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    Runnable task1 = () -> System.out.println("Hello Zoo");
    Callable<String> task2 = () -> "Monkey";

    Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
    Future<?> result2 = service.schedule(task2, 1, TimeUnit.MINUTES);
  }
}
