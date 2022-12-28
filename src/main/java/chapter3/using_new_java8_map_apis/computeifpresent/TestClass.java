package chapter3.using_new_java8_map_apis.computeifpresent;

import java.util.*;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 1);
    counts.put("Tom", null);

    BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
    Integer jenny = counts.computeIfPresent("Jenny", mapper);
    Integer sam = counts.computeIfPresent("Sam", mapper);
    Integer tom = counts.computeIfPresent("Tom", mapper);
    System.out.println(counts);
    System.out.println(jenny);
    System.out.println(sam);
    System.out.println(tom);
  }
}
