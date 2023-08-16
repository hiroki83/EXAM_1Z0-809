package reading3rd.questions.chapter4.q03;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestClassFixed {
  public static void main(String ... args) {
    Predicate<? super String> predicate = s -> s.length() > 3;
    Stream<String> stream1 = Stream.iterate("-", (s) -> s + s);
    Stream<String> stream2 = Stream.iterate("-", (s) -> s + s);
    boolean b1 = stream1.peek(System.out::println).noneMatch(predicate);
    boolean b2 = stream2.peek(System.out::println).anyMatch(predicate);
    System.out.println(b1 + " " + b2);
  }
}
