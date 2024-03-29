package reading3rd.chapter4.optionalprimitivestreams_p209;

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.OptionalDouble;

public class TestClass {
  public static void main(String ... args) {
    IntStream stream = IntStream.rangeClosed(1,10);
    OptionalDouble optional = stream.average();
    optional.ifPresent(System.out::println);
    System.out.println(optional.getAsDouble());
    System.out.println(optional.orElseGet(() -> Double.NaN));


    LongStream longs = LongStream.of(5,10);
    Long sum = longs.sum();
    System.out.println(sum);

    DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
    OptionalDouble min = doubles.min(); // runs infinitely
  }
}
