package questions.chapter4.q6;

import java.util.stream.Stream;

public class TestClassFindAny {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "meow");
    //boolean match = s.findAny(String::isEmpty);// Does not compile
    boolean match = Boolean.TRUE;
    System.out.println(match);

  }
}
