package reading3rd.questions.chapter4.q14;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

public class TestClass {
  public static void main(String ... args) {
    //Stream<Integer> s = Stream.of(1);
    Stream<Integer> s1 = Stream.of(1);
    Stream<Integer> s2 = Stream.of(1);
    //IntStream is = s.mapToInt(x -> x);
    //DoubleStream ds = s.mapToDouble(x -> x); // throw IllegalStateException
    //Stream<Integer> s2 = ds.mapToInt(x -> x); // DOES NOT COMPILE
    IntStream is = s1.mapToInt(x -> x);
    DoubleStream ds = s2.mapToDouble(x -> x);
    Stream<Double> s3 = ds.mapToObj(x -> x);
    s3.forEach(System.out::println);
  }
}
