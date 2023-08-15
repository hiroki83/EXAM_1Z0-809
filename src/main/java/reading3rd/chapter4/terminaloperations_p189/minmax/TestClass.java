package reading3rd.chapter4.terminaloperations_p189.minmax;

import java.util.stream.Stream;
import java.util.Optional;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("monkey", "ape", "bonobo");
    Optional<String> min = s.min((s1,s2) -> s1.length()-s2.length());
    min.ifPresent(System.out::println);

    Stream<String> empty = Stream.empty();
    Optional<String> max = empty.max((s1,s2) -> s1.length()-s2.length());
    System.out.println(max.isPresent());
  }
}
