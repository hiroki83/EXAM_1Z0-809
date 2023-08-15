package reading3rd.chapter4.intermediateoperations_p196.flatmap;

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    List<String> zero = Arrays.asList();
    List<String> one = Arrays.asList("Bonobo");
    List<String> two = Arrays.asList("Mamma Gorilla", "Baby Gorilla");
    Stream<List<String>> animals = Stream.of(zero, one, two);

    animals.flatMap(l -> l.stream()).forEach(System.out::println);


    Stream<Integer> s0 = Stream.empty();
    Stream<Integer> s1 = Stream.of(1);
    Stream<Integer> s2 = Stream.of(2);
    Stream<Integer> s3 = Stream.of(3);
    Stream<Stream<Integer>> ss = Stream.of(s0, s1, s2, s3);
    ss.flatMap(l -> l).forEach(System.out::println);
  }
}
