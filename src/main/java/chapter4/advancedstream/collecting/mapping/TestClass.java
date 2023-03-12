package chapter4.advancedstream.collecting.mapping;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

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
