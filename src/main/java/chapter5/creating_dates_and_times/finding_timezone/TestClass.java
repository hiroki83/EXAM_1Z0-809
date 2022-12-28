package chapter5.creating_dates_and_times.finding_timezone;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TestClass {
  public static void main(String[] args) {
    ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("Japan") || z.contains("japan")).sorted().forEach(System.out::println);
    ZoneId zone = ZoneId.of("Japan");
    ZonedDateTime zoned1 = ZonedDateTime.of(LocalDateTime.now(), zone);
    System.out.println(zoned1);
  }
}
