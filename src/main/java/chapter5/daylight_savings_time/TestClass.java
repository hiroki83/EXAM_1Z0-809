package chapter5.daylight_savings_time;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Month;

public class TestClass {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
    LocalTime time = LocalTime.of(1, 30);
    ZoneId zone = ZoneId.of("US/Eastern");
    ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);

    System.out.println(dateTime);

    dateTime = dateTime.plusHours(1);

    System.out.println(dateTime);

    LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
    LocalTime time1 = LocalTime.of(1, 30);
    ZoneId zone1 = ZoneId.of("US/Eastern");
    ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone1);

    System.out.println(dateTime1);

    dateTime1 = dateTime1.plusHours(1);

    System.out.println(dateTime1);

    dateTime1 = dateTime1.plusHours(1);

    System.out.println(dateTime1);

    LocalDate date2 = LocalDate.of(2016, Month.MARCH, 13);
    LocalTime time2 = LocalTime.of(2, 30);
    ZoneId zone2 = ZoneId.of("US/Eastern");
    ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zone2);

    System.out.println(dateTime2);
  }
}
