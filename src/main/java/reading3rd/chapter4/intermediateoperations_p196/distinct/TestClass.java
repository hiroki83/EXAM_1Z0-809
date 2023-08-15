package reading3rd.chapter4.intermediateoperations_p196.distinct;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("duck", "duck", "duck", "goose"); 
    s.distinct().forEach(System.out::println);
  }
}
