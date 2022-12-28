package chapter5.durations.temporalunit;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

public class TestClass4 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2015, 1, 20);
    Period period = Period.ofDays(1);
    Duration days = Duration.ofDays(1);
    System.out.println(date.plus(period));
    System.out.println(date.plus(days));
  }
}
