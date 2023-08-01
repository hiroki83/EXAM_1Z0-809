package reading3rd.chapter7.awaittermination_p345;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestClass {
  public static void main(String ... args) throws InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      //Future<Integer> result = service.submit(() -> 1);
      Future<Integer> result = service.submit(() -> {return 1;});
      System.out.println(result.get());
    } catch(ExecutionException e) {
      e.printStackTrace();
    } finally {
      if(service != null) service.shutdown();
    }
    if (service != null) {
      service.awaitTermination(1, TimeUnit.MINUTES);
      // Check whether all tasks are finished
      if (service.isTerminated())
        System.out.println("All tasks finished");
      else
        System.out.println("At least one task is still running");
    }
  }
}
