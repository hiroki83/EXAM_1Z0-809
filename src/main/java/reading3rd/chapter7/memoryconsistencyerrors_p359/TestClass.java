package reading3rd.chapter7.memoryconsistencyerrors_p359;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map<String, Object> foodData = new HashMap<String, Object>();
    foodData.put("penguin",1);
    foodData.put("flamingo",2);
    for(String key: foodData.keySet())
      foodData.remove(key);
  }
}
