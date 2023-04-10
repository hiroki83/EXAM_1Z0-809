//package 2nd.chapter7.synchronizing; // DOES NOT COMPILE
package reading2nd.chapter7.synchronizing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronizedWithLockObject {
  private int sheepCount = 0;
  private final Object lock = new Object();
  private void incrementAndReport() {
    synchronized(lock) {
      System.out.println((++sheepCount)+" ");
    }
  }

  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);

      SheepManagerSynchronizedWithLockObject manager = new SheepManagerSynchronizedWithLockObject();
      for (int i=0; i<10; i++)
        service.submit(() -> manager.incrementAndReport());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
