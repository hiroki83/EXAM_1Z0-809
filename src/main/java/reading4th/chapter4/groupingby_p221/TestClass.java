package reading4th.chapter4.groupingby_p221;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("cat");
    Map<Boolean, List<String>> g = s.collect(Collectors.groupingBy(b -> b.startsWith("c")));
    System.out.println(g);
  }
}
