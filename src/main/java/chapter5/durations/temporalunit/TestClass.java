package chapter5.durations.temporalunit;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestClass {
  public static void main(String[] args) {
    Duration daily = Duration.of(1, ChronoUnit.DAYS);
    System.out.println(daily);
    Duration hourly = Duration.of(1, ChronoUnit.HOURS);
    System.out.println(hourly);
    Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
    System.out.println(everyMinute);
    Duration everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
    System.out.println(everyTenSeconds);
    Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
    System.out.println(everyMilli);
    Duration everyNano = Duration.of(1, ChronoUnit.NANOS);
    System.out.println(everyNano);

    LocalTime one = LocalTime.of(5, 15);
    LocalTime two = LocalTime.of(6, 30);
    LocalDate date = LocalDate.of(2016, 1, 20);
    System.out.println(ChronoUnit.HOURS.between(one, two));
    System.out.println(ChronoUnit.MINUTES.between(one, two));
    System.out.println(ChronoUnit.MINUTES.between(one, date));

  }
}
