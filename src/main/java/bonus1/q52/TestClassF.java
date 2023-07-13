package bonus1.q52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestClassF {
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newSingleThreadExecutor();
      Future<Integer> result = service.submit(() -> {for(int i=0; i<10; i++) {} return 10;});
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
