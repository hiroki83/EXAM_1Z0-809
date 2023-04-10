package reading2nd.chapter7.parallelstreams;

import java.util.stream.Stream;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;
import java.util.concurrent.ConcurrentMap;

public class TestOneArgumentCollectMethod {
  public static void main(String ... args) {
    Stream<String> serialStream1 = Stream.of("h", "i", "r", "o");
    Set<String> serialStreamSet = serialStream1.collect(Collectors.toSet());
    System.out.println("serial stream: " + serialStreamSet);
    Stream<String> parallelStream1 = Stream.of("h", "i", "r", "o").parallel();
    Set<String> parallelStreamSet = parallelStream1.collect(Collectors.toSet());
    System.out.println("parallel stream: " + parallelStreamSet);

    Stream<String> serialStream2 = Stream.of("h", "i", "r", "o");
    List<String> serialStreamList = serialStream2.collect(Collectors.toList());
    System.out.println("serial stream: " + serialStreamList);
    Stream<String> parallelStream2 = Stream.of("h", "i", "r", "o").parallel();
    List<String> parallelStreamList = parallelStream2.collect(Collectors.toList());
    System.out.println("parallel stream: " + parallelStreamList);

    Stream<String> ohMy = Stream.of("humans", "lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length
      ,k -> k
      ,(s1, s2) -> s1 + "," + s2));
    System.out.println(map);
    System.out.println(map.getClass());
    Stream<String> ohMyGod = Stream.of("humans", "lions", "tigers", "bears").parallel();
    ConcurrentMap<Integer, List<String>> groupingMap = ohMyGod.collect(Collectors.groupingByConcurrent(String::length));
    System.out.println(groupingMap);
    System.out.println(groupingMap.getClass());
  }
}
