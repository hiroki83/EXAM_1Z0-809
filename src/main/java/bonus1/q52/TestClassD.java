package bonus1.q52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class TestClassD {
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      //Future<Integer> result = service.submit(() -> {return;});// DOES NOT COMPILE
      //useCallable(() -> {return;});// DOES NOT COMPILE
      useCallable(() -> {return null;});
    } finally {
      if(service != null) service.shutdown();
    }
  }
  public static void useCallable(Callable<Integer> expression) {}
}
