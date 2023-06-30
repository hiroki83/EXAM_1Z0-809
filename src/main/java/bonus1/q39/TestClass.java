package bonus1.q39;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("h","a");
    boolean match = s.noneMatch(String::isEmpty);
    System.out.println(match);
  }
}
