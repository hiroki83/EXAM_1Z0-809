package chapter3.workingmapmethods;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TestClass {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("koala", "bamboo");
    map.put("lion", "meat");
    map.put("giraffe", "leaf");
    String food = map.get("koala");
    for(String key: map.keySet())
      System.out.println(key + ",");


    Map<String, String> treeMap = new TreeMap<>();
    treeMap.put("koala", "bamboo");
    treeMap.put("lion", "meat");
    treeMap.put("giraffe", "leaf");
    String food2 = treeMap.get("koala");
    for(String key: treeMap.keySet())
      System.out.println(key + ",");
    for(String value: treeMap.values())
      System.out.println(value + ",");
    System.out.println(treeMap.containsKey("lion"));
    System.out.println(treeMap.containsValue("lion"));
    System.out.println(treeMap.size());
  }
}
