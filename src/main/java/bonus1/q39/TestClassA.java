package bonus1.q39;

import java.util.stream.Stream;

public class TestClassA {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "");
    boolean match = s.allMatch(String::isEmpty);// infinite
    System.out.println(match);
  }
}
