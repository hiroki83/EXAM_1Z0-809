package chapter7.concurrent_collections;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ZooManager2 {
  private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
  public void put(String key, String value) {
    foodData.put(key, value);
  }
  public Object get(String key) {
    return foodData.get(key);
  }
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(100);
      ZooManager2 manager = new ZooManager2();
      //int[] count = new int[1];//int[] is not threadsafe
      for (int i = 0; i < 50; i++) {
        final int index = i;
        synchronized(manager) {
          service.submit(() -> manager.put("key"+index,index+""));
        }
      }
      System.out.println(manager.foodData);
      System.out.println(manager.foodData.size());// Never get 50
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
