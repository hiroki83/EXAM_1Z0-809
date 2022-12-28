package chapter4.primitive_streams;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.OptionalDouble;

public class TestClass {
  public static void main(String[] args) {
    Stream<Integer> stream1 = Stream.of(1, 2, 3);
    System.out.println(stream1.reduce(0, (s, n) -> s + n));

    Stream<Integer> stream2 = Stream.of(1, 2, 3);
    System.out.println(stream2.mapToInt(x -> x).sum());

    Stream<Integer> stream3 = Stream.of(1, 2, 3);
    System.out.println(stream3.mapToInt(x -> x).average());

    IntStream intStream = IntStream.of(1, 2, 3);
    OptionalDouble avg = intStream.average();
    System.out.println(avg.getAsDouble());
  }
}
