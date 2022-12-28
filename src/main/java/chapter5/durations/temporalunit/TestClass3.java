package chapter5.durations.temporalunit;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestClass3 {
  public static void main(String[] args) {
    LocalTime time2 = LocalTime.of(6, 15);
    LocalDate date2 = LocalDate.of(2015, 1, 20);
    LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
    Duration duration2 = Duration.ofHours(23);
    System.out.println(dateTime2.plus(duration2));
    System.out.println(time2.plus(duration2));
    System.out.println(date2.plus(duration2));
  }
}
