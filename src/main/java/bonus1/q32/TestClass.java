package bonus1.q32;

import java.util.stream.Stream;
import java.util.function.UnaryOperator;
import java.util.function.Function;
import java.time.LocalDate;

public class TestClass {
  public static void main(String ... args) {
    Stream<LocalDate> s = Stream.of(LocalDate.now());
    UnaryOperator<LocalDate> u = l -> l;
    System.out.println(s.filter(l -> l != null).map(u));
  }
}
