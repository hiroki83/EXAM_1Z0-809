package reading4th.chapter4.flatmap_p198;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s1 = Stream.of("Bonobo");
    Stream<String> s2 = Stream.of("Mama Gorilla");
    Stream<String> s3 = Stream.of("Baby Gorilla");
    Stream<Stream<String>> animals = Stream.of(s1, s2, s3, Stream.empty());
    animals.flatMap(l -> l).forEach(System.out::println);
  }
}
