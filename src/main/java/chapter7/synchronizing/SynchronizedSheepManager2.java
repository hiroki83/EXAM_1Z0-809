package chapter7.synchronizing;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedSheepManager2 {
  private int sheepCount;
  private static int day;
  private synchronized void incrementAndReport() {
    System.out.print((++sheepCount)+" ");
  }
  public static synchronized void syncPrintDaysWork() {
    System.out.println("Finished work: " + ++day);
  }
  public static void printDaysWork() {
    System.out.println("Finished work: " + ++day);
  }
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);

      SynchronizedSheepManager2 manager = new SynchronizedSheepManager2();
      for(int i = 0; i<10; i++) {
        service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      if(service !=  null) service.shutdown();
    }
  }
}
