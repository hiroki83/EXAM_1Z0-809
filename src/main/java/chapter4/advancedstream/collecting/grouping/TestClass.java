package chapter4.advancedstream.collecting.grouping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map1 = ohMy1.collect(Collectors.groupingBy(String::length));
    System.out.println(map1);

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Set<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
    System.out.println(map2);

    Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Set<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
    System.out.println(map3);

    Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, List<String>> map4 = ohMy4.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
    System.out.println(map4);

    Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Long> map5 = ohMy5.collect(Collectors.groupingBy(String::length, Collectors.counting()));
    System.out.println(map5);

    Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Long> map6 = ohMy6.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
    System.out.println(map6);
  }
}
