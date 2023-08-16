package reading3rd.questions.chapter4.q03;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Predicate<? super String> predicate = s -> s.length() > 3;
    Stream<String> stream = Stream.iterate("-", (s) -> s + s);
    boolean b1 = stream.noneMatch(predicate);
    boolean b2 = stream.anyMatch(predicate);
    System.out.println(b1 + " " + b2);
  }
}
