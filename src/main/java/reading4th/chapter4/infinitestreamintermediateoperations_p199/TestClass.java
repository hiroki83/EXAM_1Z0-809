package reading4th.chapter4.infinitestreamintermediateoperations_p199;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<Integer> infinite = Stream.iterate(1, x -> x +1);
    //infinite.distinct() // no hang
    //infinite.sorted() // hang
    infinite.map(l -> l) // no hang
            .limit(5)
            .forEach(System.out::println);
    Stream<Stream<String>> infinite1 = Stream.generate(() -> Stream.of("hiroki"));
    infinite1.flatMap(l -> l)
            .limit(5)
            .forEach(System.out::println);
  }
}
