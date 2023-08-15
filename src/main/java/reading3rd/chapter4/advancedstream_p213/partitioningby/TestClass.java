package reading3rd.chapter4.advancedstream_p213.partitioningby;

import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.Map;
import java.util.List;
import java.util.Set;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map);

    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map1 = ohMy1.collect(Collectors.partitioningBy(s -> s.length() <= 7));
    System.out.println(map1);
    System.out.println(map1.get(true));
    System.out.println(map1.get(false));

    Collector c = Collectors.groupingBy(String::length, Collectors.counting());

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, Set<String>> map2 = ohMy2.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
    map2.values().stream().findAny().ifPresent(s -> System.out.println(s.getClass()));
    System.out.println(map2);
    System.out.println(map2.get(true));
    System.out.println(map2.get(false));
  }
}
