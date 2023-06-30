package bonus1.q39;

import java.util.stream.Stream;
import java.util.Optional;

public class TestClassC {
  public static void main(String ... args) {
    Stream<String> s = Stream.generate(() -> "");
    //boolean match = s.findAny(String::isEmpty);// DOES NOT COMPILE
    Optional<String> match = s.findAny();
    System.out.println(match);
  }
}
