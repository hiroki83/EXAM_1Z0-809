package reading3rd.questions.chapter4.q10;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream.generate(() -> "1")
      .limit(10)
      .peek(System.out::print)
      //.filter(x -> x.length() > 1)
      .forEach(System.out::println);
  }
}
