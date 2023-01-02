package chapter7.concurrent_collections;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class ZooManager {
  private static AtomicInteger key = new AtomicInteger(0);
  private static AtomicInteger value = new AtomicInteger(0);
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
      ZooManager manager = new ZooManager();
      for (int i = 0; i < 50; i++) {
        service.submit(() -> manager.put("key"+ZooManager.key.incrementAndGet(),ZooManager.value.incrementAndGet()+""));
      }
      System.out.println(manager.foodData);
      System.out.println(manager.foodData.size());
    } finally {
      if(service != null) service.shutdown();
    }
  }
}
