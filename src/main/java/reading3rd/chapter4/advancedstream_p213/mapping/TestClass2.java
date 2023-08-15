package reading3rd.chapter4.advancedstream_p213.mapping;

import static java.util.stream.Collectors.*;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;

public class TestClass2 {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map = ohMy.collect(
      groupingBy(
        String::length,
        mapping(s -> s.charAt(0),minBy(Comparator.<Character>naturalOrder())))
    );
    System.out.println(map);
  }
}
