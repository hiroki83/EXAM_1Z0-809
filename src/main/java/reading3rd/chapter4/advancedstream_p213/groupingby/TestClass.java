package reading3rd.chapter4.advancedstream_p213.groupingby;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
    System.out.println(map.getClass());
    map.values().stream().findAny().ifPresent(s -> System.out.println(s.getClass()));
    System.out.println(map);

    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Set<String>> map1 = ohMy1.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
    System.out.println(map1.getClass());
    map1.values().stream().findAny().ifPresent(s -> System.out.println(s.getClass()));
    System.out.println(map1);

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Set<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length, TreeMap::new,Collectors.toSet()));
    System.out.println(map2.values().getClass());
    map2.values().stream().findAny().ifPresent(s -> System.out.println(s.getClass()));
    System.out.println(map2);

    Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, List<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length, TreeMap::new,Collectors.toList()));
    System.out.println(map3.values().getClass());
    map3.values().stream().findAny().ifPresent(s -> System.out.println(s.getClass()));
    System.out.println(map3);


    Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Long> map4 = ohMy4.collect(Collectors.groupingBy(String::length, Collectors.counting()));
    System.out.println(map4);
  }
}
