package reading3rd.chapter7.obtainingsynchronizedcollections_p366;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map<String, Object> foodData = new HashMap<String, Object>();
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
    for(String key: synchronizedFoodData.keySet())
      synchronizedFoodData.remove(key);
  }
}
