package bonus1.q52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestClassG {
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<String> result = service.submit(() -> "Chipmunk");
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
