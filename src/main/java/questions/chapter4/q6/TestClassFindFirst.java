package questions.chapter4.q6;

import java.util.stream.Stream;

public class TestClassFindFirst {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "meow");
    //boolean match = s.findFirst(String::isEmpty);// Does not compile
    boolean match = Boolean.FALSE;
    System.out.println(match);

  }
}
