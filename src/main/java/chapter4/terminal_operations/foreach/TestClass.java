package chapter4.terminal_operations.foreach;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
    s.forEach(System.out::println);
  }
}
