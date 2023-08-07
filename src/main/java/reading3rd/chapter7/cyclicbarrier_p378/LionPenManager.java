package reading3rd.chapter7.cyclicbarrier_p378;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class LionPenManager {
  private void removeAnimals() throws InterruptedException { Thread.sleep(1000); System.out.println("Removing animals");}
  private void cleanPen() { System.out.println("Cleaning the pen");}
  private void addAnimals() { System.out.println("Adding animals");}

  public void performTask() throws InterruptedException {
    removeAnimals();
    cleanPen();
    addAnimals();
  }

  public static void main(String ... args) throws InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(4);
      LionPenManager manager = new LionPenManager();
      for(int i=0; i<4; i++)
        service.submit(() -> {manager.performTask(); return null;});
//    } catch(InterruptedException e) {
//      e.printStackTrace();
    } finally {
      if(service!=null) service.shutdown();
    }
  }
}
