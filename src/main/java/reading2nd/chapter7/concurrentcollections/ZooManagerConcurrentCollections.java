package reading2nd.chapter7.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ZooManagerConcurrentCollections {
  private Map<String, Object> foodData = new ConcurrentHashMap<>();
  public synchronized void put(String key, Object value) {
    foodData.put(key, value);
  }

  public synchronized Object get(String key) {
    return foodData.get(key);
  }

  public static void main(String ... args) {
    ZooManagerSynchronized manager = new ZooManagerSynchronized();
    String key = "HIROKI";
    manager.put(key, 1);
    System.out.println(manager.get(key));
  }
}
