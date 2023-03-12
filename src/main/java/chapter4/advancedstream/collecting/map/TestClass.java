package chapter4.advancedstream.collecting.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
    System.out.println(map);

    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<String, Integer> map1 = ohMy1.collect(Collectors.toMap(Function.identity(), String::length));
    System.out.println(map1);

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    //Map<String, Integer> map2 = ohMy1.collect(Collectors.toMap(Function::identity, String::length));//COMPILE ERROR
    //System.out.println(map1);

    Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map3 = ohMy3.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2) -> s1 + "," + s2));
    System.out.println(map3);
    System.out.println(map3.getClass());

    Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map4 = ohMy4.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2) -> s1 + "," + s2, TreeMap::new));
    System.out.println(map4);
    System.out.println(map4.getClass());
  }
}
