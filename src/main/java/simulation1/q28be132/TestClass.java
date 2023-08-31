package simulation1.q28be132;

import java.util.stream.Stream;
import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class TestClass {
  public static void main(String ... args) {
    Stream<LocalDate> s = Stream.of(LocalDate.now());
    UnaryOperator<LocalDate> u = l -> l;
    System.out.println(s.filter(l -> l != null).map(u));
  }
}
