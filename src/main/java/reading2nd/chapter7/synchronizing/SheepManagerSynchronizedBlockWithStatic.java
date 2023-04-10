//package 2nd.chapter7.synchronizing; // DOES NOT COMPILE
package reading2nd.chapter7.synchronizing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronizedBlockWithStatic {
  private int sheepCount = 0;
  private static int workerCount = 0;
  private void incrementAndReport() {
    synchronized(this) {
      System.out.println((++sheepCount)+" ");
    }
  }

  public static void printDaysWork(int workerId) {
    synchronized(SheepManagerSynchronizedBlockWithStatic.class) {
      System.out.println("Finished work" + workerId + ", " + (++workerCount));
    }
  }

  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);

      SheepManagerSynchronizedBlockWithStatic manager = new SheepManagerSynchronizedBlockWithStatic();
      for (int i=0; i<10; i++)
        service.submit(() -> manager.incrementAndReport());
      for (int i=0; i<10; i++) {
        final int workerId = i;
        service.submit(() -> SheepManagerSynchronizedBlockWithStatic.printDaysWork(workerId));
      }
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
