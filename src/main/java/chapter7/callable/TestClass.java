package chapter7.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.text.ParseException;

public class TestClass {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      service.submit(() -> {Thread.sleep(1000); return null;});
      Future<Integer> result = service.submit(() -> {return test("hiroki");});
      System.out.println(result.get());
      //service.submit(() -> {Thread.sleep(1000);});// DOES NOT COMPILE
    } finally {
      //service.awaitTermination(1, TimeUnit.MINUTES);
      //if (service.isTerminated())
      //  System.out.println("All tasks finished");
      //else
      //  System.out.println("At least one task is still running");
      if(service!=null) service.shutdown();
    }
    if(service != null) {
      service.awaitTermination(1, TimeUnit.MINUTES);
      // Check whether all tasks are finished
      if (service.isTerminated())
        System.out.println("All tasks finished");
      else
        System.out.println("At least one task is still running");
    }
  }
  private static int test(String s) throws ParseException {
    return Integer.parseInt(s);
  }
}
