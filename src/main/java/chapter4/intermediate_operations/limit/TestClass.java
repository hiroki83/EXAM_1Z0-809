package chapter4.intermediate_operations.limit;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Stream<Integer> s = Stream.iterate(1, n -> n + 1);
    s.skip(5).limit(2).forEach(System.out::println);
  }
}
