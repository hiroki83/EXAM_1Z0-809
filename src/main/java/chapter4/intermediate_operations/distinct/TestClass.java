package chapter4.intermediate_operations.distinct;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("duck", "duck", "duck", "gooese");
    s.distinct().forEach(System.out::println);
  }
}
