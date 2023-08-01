package reading3rd.chapter7.synchronizedblocks_p355;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SheepManager {
  private int sheepCount = 0;
  private void incrementAndReport() {
    System.out.print((++sheepCount)+" ");
  }
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManager manager = new SheepManager();
      for(int i = 0; i<10; i++)
        synchronized(manager) {
          service.submit(() -> manager.incrementAndReport());
        }
      Thread.sleep(1000);
      System.out.println();
    } catch(InterruptedException e) {
      e.printStackTrace();
    } finally {
      if(service!=null) service.shutdown();
    }
  }
}
