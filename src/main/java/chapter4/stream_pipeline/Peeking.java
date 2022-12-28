package chapter4.stream_pipeline;

import java.util.stream.Stream;

public class Peeking {
  public static void main(String[] args) {
    Stream<Integer> infinite1 = Stream.iterate(1, x -> x + 1);
    infinite1.limit(5).peek(System.out::print).filter(x -> x % 2 == 1).forEach(System.out::print);
    System.out.println();

    Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
    infinite2.filter(x -> x % 2 == 1).peek(System.out::print).limit(5).forEach(System.out::print);
    System.out.println();
  }
}
