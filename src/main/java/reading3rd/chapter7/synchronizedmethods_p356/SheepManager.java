package reading3rd.chapter7.synchronizedmethods_p356;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SheepManager {
  private int sheepCount = 0;
  private static int workerCount = 0;
  synchronized private void incrementAndReport() {
    System.out.print((++sheepCount)+" ");
  }
//  public static void printDaysWork() {
//    synchronized(SheepManager.class) {
//      System.out.println("Finished work "+ ++workerCount);
//    }
//  }
  public static void printDaysWork() {
    System.out.println("Finished work "+ ++workerCount);
  }
//  synchronized public static void printDaysWork() {
//    System.out.println("Finished work "+ ++workerCount);
//  }
  public static void main(String ... args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      SheepManager manager = new SheepManager();
      for(int i = 0; i<10; i++)
        service.submit(() -> {manager.incrementAndReport(); new SheepManager().printDaysWork();});
      Thread.sleep(1000);
      System.out.println();
    } catch(InterruptedException e) {
      e.printStackTrace();
    } finally {
      if(service!=null) service.shutdown();
    }
  }
}
