package questions.chapter4.q6;

import java.util.stream.Stream;

public class TestClassNoneMatch {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "meow");
    boolean match = s.noneMatch(String::isEmpty);
    System.out.println(match);

  }
}
