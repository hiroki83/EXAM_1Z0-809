package questions.chapter5.q14;

import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class TestClassB {
  public static void main(String ... args) {
    ZoneId zone = ZoneId.of("US/Eastern");
    LocalDate date = LocalDate.of(2016, 3, 40);
    LocalTime time = LocalTime.of(2, 15);
    ZonedDateTime a = ZonedDateTime.of(date, time, zone);
    System.out.println(a);
  }
}
