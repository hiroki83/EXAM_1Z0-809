package chapter5.instants;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestClass {
  public static void main(String[] args) {
    Instant now = Instant.now();
    for(int i = 0; i < 100; i++)
      System.out.print(i);
    System.out.println();
    Instant later = Instant.now();

    Duration duration = Duration.between(now, later);
    System.out.println(duration.toMillis());

    LocalDate date = LocalDate.of(2015, 5, 25);
    LocalTime time = LocalTime.of(11, 55, 00);
    ZoneId zone = ZoneId.of("Japan");
    ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
    Instant instant = zonedDateTime.toInstant();
    System.out.println(zonedDateTime);
    System.out.println(instant);
    Long epochSeconds = zonedDateTime.toEpochSecond();
    Instant instant2 = Instant.ofEpochSecond(epochSeconds);
    System.out.println(instant2);
 
    Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
    System.out.println(nextDay);
    Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
    System.out.println(nextHour);
    Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);// exception
  }
}
