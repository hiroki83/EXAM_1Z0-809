package reading3rd.chapter3.mapmethods_p139;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TestClass {
  public static void main(String ... args) {
    Map<String, String> map = new HashMap<>();
    map.put("giraffa", "leaf");
    map.put("lion", "meat");
    map.put("koala", "bamboo");
    String food = map.get("koala");
    for (String key: map.keySet())
      System.out.print(key + ",");


    Map<String, String> map2 = new TreeMap<>();
    map2.put("koala", "bamboo");
    map2.put("lion", "meat");
    map2.put("giraffa", "leaf");
    map2.put("giraffa", "leaf");
    String food2 = map2.get("koala");
    for (String key: map2.keySet())
      System.out.print(key + ",");

    //System.out.println(map.contains("lion"));// DOES NOT COMPILE
    System.out.println(map.containsKey("lion"));
    System.out.println(map.containsValue("lion"));
    System.out.println(map.size());
  }
}
