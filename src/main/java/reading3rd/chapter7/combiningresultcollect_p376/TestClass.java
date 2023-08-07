package reading3rd.chapter7.combiningresultcollect_p376;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Set;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
    Set<String> set = stream.collect(Collectors.toSet());
    System.out.println(set); // [f, w, l, o]
  }
}
