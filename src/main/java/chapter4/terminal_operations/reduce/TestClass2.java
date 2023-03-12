package chapter4.terminal_operations.reduce;

import java.util.stream.Stream;

public class TestClass2 {
  public static void main(String[] args) {
    Stream<Integer> stream = Stream.empty();
    System.out.println(stream.reduce(10, (a, b) -> a*b));
    Stream<Integer> stream2 = Stream.of(3,5,6);
    System.out.println(stream2.reduce(10, (a, b) -> a*b));
  }
}
