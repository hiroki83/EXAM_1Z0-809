package bonus2.q20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestClass {
  public static void main(String ... args) {
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:MM");
    //DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:Mi"); // throw IllegalArgumentException
    DateTimeFormatter f3 = DateTimeFormatter.ofPattern("hh:mm");
    System.out.println(d.format(f1));
    //System.out.println(d.format(f2));
    System.out.println(d.format(f3));
  }
}
