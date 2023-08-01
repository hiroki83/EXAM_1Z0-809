package reading3rd.chapter7.atomic_p350;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SheepManagerSynchronized {
  private int sheepCount = 0;
  synchronized private void incrementAndReport() {
    //System.out.print((++sheepCount)+" ");
    System.out.print((sheepCount++)+" ");
  }
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManagerSynchronized manager = new SheepManagerSynchronized();
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
