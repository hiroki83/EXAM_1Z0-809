package bonus1.q35;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class TestClassB {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("1");
    IntStream is = stream.mapToInt(Integer::parseInt);
  }
}
