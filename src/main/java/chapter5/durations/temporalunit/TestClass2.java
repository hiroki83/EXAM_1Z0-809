package chapter5.durations.temporalunit;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestClass2 {
  public static void main(String[] args) {
    LocalTime time = LocalTime.of(6, 15);
    LocalDate date = LocalDate.of(2015, 1, 20);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    Duration duration = Duration.ofHours(6);
    System.out.println(dateTime.plus(duration));
    System.out.println(time.plus(duration));
    System.out.println(date.plus(duration));
  }
}
