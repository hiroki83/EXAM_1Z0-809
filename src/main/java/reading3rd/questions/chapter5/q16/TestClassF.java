package reading3rd.quesitions.chapter5.q16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Instant;

public class TestClassF {
  public static void main(String ... args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    ZoneId zoneId = ZoneId.systemDefault();
    ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
    long epochSeconds = 0;
    Instant instant = zonedDateTime.toInstant();
  }
}
