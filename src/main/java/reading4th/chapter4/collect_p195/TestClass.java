package reading4th.chapter4.collect_p195;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    System.out.println(word);
    Stream<String> stream2 = Stream.of("w", "o", "l", "f");
    System.out.println(stream2.collect(Collectors.joining()));
  }
}
