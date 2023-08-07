package reading3rd.chapter7.combiningresultcollect_p376;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.ConcurrentMap;

public class TestClassToConcurrentMap {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, String> map = ohMy
      .collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
    System.out.println(map); // [5=lions, bears, 6=tigers]
    System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
  }
}
