package questions.chapter4.q6;

import java.util.stream.Stream;

public class TestClassAnyMatch {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "meow");
    boolean match = s.anyMatch(String::isEmpty);// Does not terminate, infinite loop
    System.out.println(match);
  }
}
