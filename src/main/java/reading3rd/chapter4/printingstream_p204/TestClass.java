package reading3rd.chapter4.printingstream_p204;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s1 = Stream.of("hiroki", "inoue", "nousa");
    s1.forEach(System.out::println);

    Stream<String> s2 = Stream.of("hiroki", "inoue", "nousa");
    System.out.println(s2.collect(Collectors.toList()));

    Stream<String> s3 = Stream.of("hiroki", "inoue", "nousa");
    s3.peek(System.out::println).count();

    Stream<String> s4 = Stream.generate(() -> "hiroki");
    s4.limit(5).forEach(System.out::println);
  }
}
