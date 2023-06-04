package bonus1.q25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.Period;

public class TestClass {
  public static void main(String ... args) {
    LocalDate d = LocalDate.of(2015, 5, 1);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println(f.format(d));
  }
}
