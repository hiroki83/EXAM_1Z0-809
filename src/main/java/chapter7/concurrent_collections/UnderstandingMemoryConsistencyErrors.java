package chapter7.concurrent_collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.HashMap;

public class UnderstandingMemoryConsistencyErrors {
  public static void main(String[] args) {
    //Map<String, Object> foodData = new HashMap<String, Object>();//ConcurrentModificationException
    Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();//ConcurrentModificationException
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    for(String key: foodData.keySet())
      foodData.remove(key);
  }
}
