package bonus1.q52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestClassA {
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      //Future<Integer> result = service.submit(void -> 10);// DOES NOT COMPILE
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
