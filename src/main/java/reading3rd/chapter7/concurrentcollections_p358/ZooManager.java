package reading3rd.chapter7.concurrentcollections_p358;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ZooManager {
  private Map<String, Object> foodData = new HashMap<String, Object>();
  public synchronized void put(String key, String value) {
    System.out.println(key+", "+value);
    foodData.put(key, value);
  }
  public synchronized Object get(String key) {
    return foodData.get(key);
  }
  public static void main(String ... args) throws InterruptedException {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      ZooManager manager = new ZooManager();
      int[] count = new int[1];
      for (int i = 0; i<10; i++) {
        service.submit(() -> manager.put(++count[0]+"", Math.random()+""));
      }
//      System.out.println(manager.foodData.size());
      Thread.sleep(1000);
      for (String key : manager.foodData.keySet())
        System.out.println("key: " + key + ", value: " + manager.get(key));
    } finally {
      if(service!=null) service.shutdown();
    }
  }
}
