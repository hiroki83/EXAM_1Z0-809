package chapter4.primitive_streams.advanced.collecting.mapping;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map1 = ohMy1.collect(
      groupingBy(
        String::length,
        Collectors.mapping(s -> s.charAt(0),
          Collectors.minBy(Comparator.<Character>naturalOrder()))
      )
    );
    System.out.println(map1);

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map2 = ohMy2.collect(
      groupingBy(
        String::length,
        mapping(s -> s.charAt(0),
          minBy(Comparator.<Character>naturalOrder()))
      )
    );
    System.out.println(map2);
  }
}
