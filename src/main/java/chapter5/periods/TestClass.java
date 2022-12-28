package chapter5.periods;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Month;

public class TestClass {
  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
    LocalDate end   = LocalDate.of(2015, Month.MARCH, 30);
    Period period = Period.ofMonths(1);
    performAnimalEnrichment(start, end, period);
    Period everyYearAndWeek = Period.of(1, 0, 7);
    System.out.println(everyYearAndWeek);
    Period wrong = Period.ofYears(1).ofWeeks(1);
    Period wrong2 = Period.ofYears(1);
    wrong2 = Period.ofWeeks(1);

    LocalDate date = LocalDate.of(2015, 1, 20);
    LocalTime time = LocalTime.of(6, 15);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    Period period2 = Period.ofMonths(1);
    System.out.println(date.plus(period2));
    System.out.println(dateTime.plus(period2));
    System.out.println(time.plus(period2));
  }

  private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
    LocalDate upTo = start;
    while (upTo.isBefore(end)) {
      System.out.println("give new toy: " + upTo);
      upTo = upTo.plus(period);
    }
  }
}
