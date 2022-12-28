package chapter4.creating_streams;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleStream = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1, 2, 3);

    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> fromList = list.stream();
    Stream<String> fromListParallel = list.parallelStream();

    Stream<Double> randoms = Stream.generate(Math::random);
    //System.out.println(randoms.findFirst().get());
    randoms.findFirst().ifPresent(System.out::println);
    Stream<Integer> oddNumber = Stream.iterate(1, n -> n + 2);
    //System.out.println(oddNumber.findAny().get());
    oddNumber.findFirst().ifPresent(System.out::println);
  }
}
