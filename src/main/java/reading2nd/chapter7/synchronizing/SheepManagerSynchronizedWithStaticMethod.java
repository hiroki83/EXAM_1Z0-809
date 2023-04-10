//package 2nd.chapter7.synchronizing; // DOES NOT COMPILE
package reading2nd.chapter7.synchronizing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronizedWithStaticMethod {
  private int sheepCount = 0;
  private static int workerCount = 0;
  //private int workerCount = 0;
  private void incrementAndReport() {
//    synchronized(this) {
      System.out.println((++sheepCount)+" ");
//    }
  }

  public synchronized static void printDaysWork(int workerId) {
  //public void printDaysWork(int workerId) {
  //public void printDaysWork() {
    System.out.println("Finished work " + workerId + "," + (++workerCount));
    //System.out.println("Finished work " + (++workerCount));
  }

  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);

      SheepManagerSynchronizedWithStaticMethod manager = new SheepManagerSynchronizedWithStaticMethod();
      for (int i=0; i<10; i++) {
        final int workerId = i;
        service.submit(() -> SheepManagerSynchronizedWithStaticMethod.printDaysWork(workerId));
        //service.submit(() -> manager.printDaysWork(workerId));
        //service.submit(() -> manager.printDaysWork());
      }
      for (int i=0; i<10; i++)
        service.submit(() -> manager.incrementAndReport());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
