package bonus2.q11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestClass {
  public static void main(String ... args) {
    LocalDate date = LocalDate.of(2100, 5, 14);
    LocalTime time = LocalTime.of(9, 15);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    //Duration centuries = Duration.of(7, ChronoUnit.CENTURIES);// throw UnsupportedTemporalTypeException
    Duration days = Duration.of(7, ChronoUnit.DAYS);
    //Duration decades = Duration.of(7, ChronoUnit.DECADES);// throw UnsupportedTemporalTypeException
    //Duration eras = Duration.of(7, ChronoUnit.ERAS);// throw UnsupportedTemporalTypeException
    Duration halfDays = Duration.of(7, ChronoUnit.HALF_DAYS);
    Duration hours = Duration.of(7, ChronoUnit.HOURS);
    Duration micros = Duration.of(7, ChronoUnit.MICROS);
    //Duration millennia = Duration.of(7, ChronoUnit.MILLENNIA);// throw UnsupportedTemporalTypeException
    Duration millis = Duration.of(7, ChronoUnit.MILLIS);
    Duration minutes = Duration.of(7, ChronoUnit.MINUTES);
    //Duration months = Duration.of(7, ChronoUnit.MONTHS);// throw UnsupportedTemporalTypeException
    Duration nanos = Duration.of(7, ChronoUnit.NANOS);
    Duration sesconds = Duration.of(7, ChronoUnit.SECONDS);
    //Duration weeks = Duration.of(1, ChronoUnit.WEEKS); // throw UnsupportedTemporalTypeException
    //Duration years = Duration.of(7, ChronoUnit.YEARS);// throw UnsupportedTemporalTypeException
    System.out.println(days);
    System.out.println(halfDays);
    System.out.println(dateTime.plus(days));
  }
}
