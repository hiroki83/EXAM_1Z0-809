package bonus1.q39;

import java.util.stream.Stream;

public class TestClassE {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "");
    boolean match = s.noneMatch(String::isEmpty);
    System.out.println(match);
  }
}
