package chapter7.thread_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CheckResults2 {
  private static int counter = 0;
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<Integer> result = service.submit(() -> {
        for(int i=0; i<500; i++) CheckResults2.counter++;
        return CheckResults2.counter;
      });
      result.get(10, TimeUnit.SECONDS);
      System.out.println("Reached!");
    } catch (TimeoutException e) {
      System.out.println("Not reached in time");
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
