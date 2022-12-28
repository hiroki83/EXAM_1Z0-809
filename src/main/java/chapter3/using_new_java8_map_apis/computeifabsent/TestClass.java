package chapter3.using_new_java8_map_apis.computeifabsent;

import java.util.*;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 15);
    counts.put("Tom", null);

    //Function<String, Integer> mapper = (k) -> 1;
    Function<String, Integer> mapper = k -> 1;
    Integer jenny = counts.computeIfAbsent("Jenny", mapper);
    Integer sam = counts.computeIfAbsent("Sam", mapper);
    Integer tom = counts.computeIfAbsent("Tom", mapper);
    System.out.println(counts);
  }
}
