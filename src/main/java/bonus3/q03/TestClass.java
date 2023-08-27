package bonus3.q03;

import java.time.LocalDate;
import java.util.function.UnaryOperator;
import java.util.function.Function;
import java.util.Calendar;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<LocalDate> s = Stream.of(LocalDate.now());
    //UnaryOperator<LocalDate> u = l -> l.get(Calendar.DAY_OF_MONTH); // DOES NOT COMPILE
    Function<LocalDate, Integer> u = l -> l.getDayOfMonth();
    long result = s.filter(l -> l != null).map(u).count();
    System.out.println(result);
  }
}
