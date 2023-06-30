package bonus1.q39;

import java.util.stream.Stream;

public class TestClassB {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "");
    boolean match = s.anyMatch(String::isEmpty);// infinite
    System.out.println(match);
  }
}
