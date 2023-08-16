package reading3rd.questions.chapter4.q01;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> stream = Stream.iterate("", (s) -> s + "1");
    System.out.println(stream.limit(2).map(x -> x + "2"));
  }
}
