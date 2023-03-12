package questions.chapter4.q3;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Predicate<? super String> predicate = s -> s.length() < 1;
    //Predicate<? super String> predicate = s -> s.length() > 3;
    Stream<String> stream = Stream.iterate("-", (s) -> s + s);
    Stream<String> stream1 = Stream.iterate("-", (s) -> s + s);
    boolean b1 = stream.noneMatch(predicate);
    //boolean b2 = stream.anyMatch(predicate);// RuntimeException IllegalStateException
    boolean b2 = stream1.anyMatch(predicate);// Does not terminate, infinite loop
    System.out.println(b1 + " " + b2);
  }
}
