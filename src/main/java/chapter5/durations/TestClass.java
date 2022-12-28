package chapter5.durations;

import java.time.LocalDateTime;
import java.time.Duration;

public class TestClass {
  public static void main(String[] args) {
    Duration daily = Duration.ofDays(1);
    Duration hourly = Duration.ofHours(1);
    Duration everyMinute = Duration.ofMinutes(1);
    Duration everyTenSeconds = Duration.ofSeconds(10);
    Duration everyMilli = Duration.ofMillis(1);
    Duration everyNano = Duration.ofNanos(1);
    System.out.println(daily);
    System.out.println(hourly);
    System.out.println(everyMinute);
    System.out.println(everyTenSeconds);
    System.out.println(everyMilli);
    System.out.println(everyNano);
  }
}
