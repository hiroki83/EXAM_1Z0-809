package reading2nd.chapter7.concurrentcollections;

import java.util.Map;
import java.util.HashMap;

public class TestMemoryConsistencyErrors {
  public static void main(String ... args) {
    Map<String, Object> foodData = new HashMap<String, Object>();
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    for (String key: foodData.keySet()) {
      System.out.println("remove by key: " + key);
      foodData.remove(key);
    }
  }
}
