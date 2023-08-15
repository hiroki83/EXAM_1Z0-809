package reading3rd.chapter4.advancedstream_p213.mapping;

import java.util.stream.Collectors;
//import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.groupingBy;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map = ohMy.collect(
      Collectors.groupingBy(
        String::length,
        Collectors.mapping(s -> s.charAt(0),Collectors.minBy(Comparator.<Character>naturalOrder())))
    );
    System.out.println(map);

    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map1 = ohMy1.collect(
      groupingBy(
        String::length,
        mapping(s -> s.charAt(0),minBy(Comparator.<Character>naturalOrder())))
        //mapping(s -> s.charAt(0),minBy(Comparator.naturalOrder()))) // DOES NOT COMPILE
    );
    System.out.println(map1);
  }
}
