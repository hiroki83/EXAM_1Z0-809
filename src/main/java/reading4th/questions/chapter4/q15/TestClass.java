package readinn4th.questions.chapter4.q15;

import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s1 = Stream.of("a");
    Stream<String> s2 = Stream.of("b");
    Stream<String> s3 = Stream.of("c");
    Stream<String> s4 = Stream.of("d");

    Map<Boolean, List<String>> p1 = s1.collect(Collectors.partitioningBy(String::isEmpty));
    Map<Boolean, Set<String>> p2 = s2.collect(Collectors.partitioningBy(String::isEmpty, Collectors.toSet()));
    Map<Boolean, List<String>> p3 = s3.collect(Collectors.partitioningBy(String::isEmpty, Collectors.toList()));
    Map<Boolean, Map<String, String>> p4 = s4.collect(Collectors.partitioningBy(String::isEmpty, Collectors.toMap(k -> k, v -> v)));
  }
}
