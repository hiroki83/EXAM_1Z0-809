package reading3rd.chapter4.primitivestreams_p206;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    IntStream emptyIntSream = IntStream.empty();
    LongStream emptyLongSream = LongStream.empty();
    DoubleStream emptyDoubleSream = DoubleStream.empty();

    IntStream shortStream = IntStream.of((short) 1);
    IntStream byteStream = IntStream.of((byte) 1);
    IntStream charStream = IntStream.of('1');
    DoubleStream oneValueDoubleStream = DoubleStream.of(3.14);
    DoubleStream floatStream = DoubleStream.of(3.14f);
    DoubleStream varargsDoubleStream = DoubleStream.of(1.0, 1.1, 1.2);
    oneValueDoubleStream.forEach(System.out::println);
    System.out.println();
    varargsDoubleStream.forEach(System.out::println);

    DoubleStream random = DoubleStream.generate(Math::random);
    DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
    random.limit(3).forEach(System.out::println);
    System.out.println();
    fractions.limit(3).forEach(System.out::println);
    System.out.println();

    IntStream randomInt = new Random().ints();
    randomInt.limit(3).forEach(System.out::println);
    System.out.println();

    IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
    count.forEach(System.out::print);
    System.out.println();

    IntStream countWithRange = IntStream.range(1,6);
    countWithRange.forEach(System.out::print);
    System.out.println();

    IntStream countWithRangeClosed = IntStream.rangeClosed(1,5);
    countWithRangeClosed.forEach(System.out::print);
    System.out.println();


    Stream<Integer> stream1 = Stream.empty();
    Stream<Integer> mapStream1 = stream1.map(s -> s);
    IntStream mapIntStream1 = stream1.mapToInt(s -> s);
    LongStream mapLongStream1 = stream1.mapToLong(s -> s);
    DoubleStream mapDoubleStream1 = stream1.mapToDouble(s -> s);


    IntStream stream2 = IntStream.empty();
    Stream<Integer> mapStream2 = stream2.mapToObj(s -> s);
    IntStream mapIntStream2 = stream2.map(s -> s);
    LongStream mapLongStream2 = stream2.mapToLong(s -> s);
    DoubleStream mapDoubleStream2 = stream2.mapToDouble(s -> s);


    LongStream stream3 = LongStream.empty();
    Stream<Long> mapStream3 = stream3.mapToObj(s -> s);
    IntStream mapIntStream3 = stream3.mapToInt(s -> (int) s);
    LongStream mapLongStream3 = stream3.map(s -> s);
    DoubleStream mapDoubleStream3 = stream3.mapToDouble(s -> s);


    DoubleStream stream4 = DoubleStream.empty();
    Stream<Double> mapStream4 = stream4.mapToObj(s -> s);
    IntStream mapIntStream4 = stream4.mapToInt(s -> (int) s);
    LongStream mapLongStream4 = stream4.mapToLong(s -> (long) s);
    DoubleStream mapDoubleStream4 = stream4.map(s -> s);


    Stream<String> objStream = Stream.of("penguin", "fish");
    IntStream intStream = objStream.mapToInt(s -> s.length());
  }
}
