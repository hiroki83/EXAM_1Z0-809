package chapter4.advancedstream.collecting.partitioning;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map1 = ohMy1.collect(Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map1);

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map2 = ohMy2.collect(Collectors.partitioningBy(s -> s.length() <= 7));
    System.out.println(map2);

    Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, Set<String>> map3 = ohMy3.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
    System.out.println(map3);
  }
}
