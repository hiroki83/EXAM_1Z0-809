package reading4th.chapter4.partitioningbyemptystream_p222;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.List;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.empty();
    Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
    System.out.println(p); // {false=[], true=[]}
  }
}
