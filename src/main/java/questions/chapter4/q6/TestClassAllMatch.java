package questions.chapter4.q6;

import java.util.stream.Stream;

public class TestClassAllMatch {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "meow");
    boolean match = s.allMatch(String::isEmpty);
    System.out.println(match);
  }
}
