package reading4th.chapter4.nonematch_p192;

import java.util.stream.Stream;
import java.util.function.Predicate;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> infinite = Stream.generate(() -> "chimp");
    Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
    System.out.println(infinite.noneMatch(pred));
  }
}
