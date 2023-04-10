package chapter7.scheduling;

import java.util.concurrent.*;

public class TestClass {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.out.println(Runtime.getRuntime().availableProcessors());
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    Runnable task1 = () -> System.out.println("Hello Zoo");
    Callable<String> task2 = () -> "Monkey";

    Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
    Future<?> result2 = service.schedule(task2, 1, TimeUnit.MINUTES);
    System.out.println(result2.get());
  }
}
