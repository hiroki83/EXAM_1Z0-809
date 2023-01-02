package chapter7.synchronizing;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedSheepManager {
  private int sheepCount;
  private final Object lock = new Object();
  private void incrementAndReport() {
    synchronized(lock) {
      System.out.print((++sheepCount)+" ");
    }
  }
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);

      SynchronizedSheepManager manager = new SynchronizedSheepManager();
      for(int i = 0; i<10; i++) {
        service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      if(service !=  null) service.shutdown();
    }
  }
}
