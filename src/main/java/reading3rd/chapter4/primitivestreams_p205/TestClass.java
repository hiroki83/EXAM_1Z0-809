package reading3rd.chapter4.primitivestreams_p205;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.OptionalDouble;

public class TestClass {
  public static void main(String ... args) {
    Stream<Integer> stream1 = Stream.of(1,2,3);
    System.out.println(stream1.reduce(0, (s, n) -> s + n));

    Stream<Integer> stream2 = Stream.of(1,2,3);
    System.out.println(stream2.mapToInt(x -> x).sum());

    IntStream intStream1 = IntStream.of(1,2,3);
    OptionalDouble avg1 = intStream1.average();
    if(avg1.isPresent())
      System.out.println(avg1.getAsDouble());
  }
}
