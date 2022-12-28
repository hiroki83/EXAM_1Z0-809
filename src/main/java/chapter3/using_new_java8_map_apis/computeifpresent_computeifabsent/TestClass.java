package chapter3.using_new_java8_map_apis.computeifpresent_computeifabsent;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 1);

    counts.computeIfPresent("Jenny", (k, v) -> null);
    counts.computeIfAbsent("Sam", k -> null);
    System.out.println(counts);
  }
}
