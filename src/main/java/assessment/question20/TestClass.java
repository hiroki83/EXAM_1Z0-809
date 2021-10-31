package assessment.question20;
import java.time.*;
import java.util.stream.*;
import java.util.function.UnaryOperator;
public class TestClass {
  public static void main(String[] args) {
    Stream<LocalDate> s = Stream.of(LocalDate.now());
    UnaryOperator<LocalDate> u = l -> l;
    s.filter(l -> l != null).map(u).peek(System.out::println);
  }
}
