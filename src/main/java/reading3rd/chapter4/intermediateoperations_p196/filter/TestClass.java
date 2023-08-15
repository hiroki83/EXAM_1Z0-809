package reading3rd.chapter4.intermediateoperations_p196.filter;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    s.filter(x -> x.startsWith("m")).forEach(System.out::println);
  }
}
