package reading3rd.questions.chapter4.q16;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.empty();
    Stream<String> s2 = Stream.empty();
    Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
    Map<Boolean, List<String>> g = s2.collect(Collectors.groupingBy(b -> b.startsWith("c")));
    System.out.println(p + " " + g);
  }
}
