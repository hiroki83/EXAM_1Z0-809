package chapter4.intermediate_operations.sorted;

import java.util.stream.Stream;
import java.util.Comparator;

public class TestClass {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("brown-", "bear-");
    s.sorted().forEach(System.out::println);

    Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
    s2.sorted(Comparator.reverseOrder()).forEach(System.out::println);

    //Stream<String> s3 = Stream.of("brown bear-", "grizzly-");
    //s3.sorted(Comparator::reverseOrder).forEach(System.out::println);//compile error
  }
}
