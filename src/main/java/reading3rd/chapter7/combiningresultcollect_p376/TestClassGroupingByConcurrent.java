package reading3rd.chapter7.combiningresultcollect_p376;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.ConcurrentMap;
import java.util.List;

public class TestClassGroupingByConcurrent {
  public static void main(String ... args) {
    Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, List<String>> map = ohMy
      .collect(Collectors.groupingByConcurrent(String::length));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}
  }
}
