package reading3rd.chapter7.synchronizedblocks_p355;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SheepManagerSynchronized2 {
  private int sheepCount = 0;
  private final Object lock = new Object();
  private void incrementAndReport() {
    synchronized(lock) {
      System.out.print((++sheepCount)+" ");
    }
  }
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManagerSynchronized2 manager = new SheepManagerSynchronized2();
      for(int i = 0; i<10; i++)
          service.submit(() -> manager.incrementAndReport());
      Thread.sleep(1000);
      System.out.println();
    } catch(InterruptedException e) {
      e.printStackTrace();
    } finally {
      if(service!=null) service.shutdown();
    }
  }
}
