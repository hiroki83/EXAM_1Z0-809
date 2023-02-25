package chapter3.using_new_java8_map_apis;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.HashMap;
import java.util.Map;

public class Table3_12 {
  public static void main(String[] args) {
    Function<String, Integer> mapper = (k1) -> 1;

    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 2);
    counts.put("Tom", null);
 
    Integer tom = counts.computeIfAbsent("Tom", mapper);
    System.out.println(counts);
    System.out.println(tom);
  }
}
