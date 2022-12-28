package chapter5.creating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());
  }
}
