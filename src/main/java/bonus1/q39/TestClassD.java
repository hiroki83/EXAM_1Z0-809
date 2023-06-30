package bonus1.q39;

import java.util.stream.Stream;
import java.util.Optional;

public class TestClassD {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "");
    //boolean match = s.findFirst(String::isEmpty);// DOES NOT COMPILE
    Optional<String> match = s.findFirst();
    System.out.println(match);
  }
}
