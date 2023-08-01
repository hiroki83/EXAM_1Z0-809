package reading3rd.chapter7.memoryconsistencyerrors_p359;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestClass2 {
  public static void main(String ... args) {
    Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
    foodData.put("penguin",1);
    foodData.put("flamingo",2);
    System.out.println(foodData.size());
    for(String key: foodData.keySet())
      foodData.remove(key);
    System.out.println(foodData.size());
  }
}
