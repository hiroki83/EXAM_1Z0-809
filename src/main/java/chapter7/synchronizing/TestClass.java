package chapter7.synchronizing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TestClass {
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      for(int i=0; i<10; i++)
        //service.submit(() -> SynchronizedSheepManager2.printDaysWork());
        service.submit(() -> SynchronizedSheepManager2.syncPrintDaysWork());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
