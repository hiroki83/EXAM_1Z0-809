package chapter4.intermediate_operations.map;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    s.map(String::length).forEach(System.out::println);
  }
}
