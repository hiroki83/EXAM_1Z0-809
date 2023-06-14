package bonus1.q35;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class TestClassC {
  public static void main(String ... args) {
    Stream<String> stream = Stream.of("1");
    //Stream<Integer> is = stream.mapToInt(Integer::parseInt);// DOES NOT COMPILE
  }
}
