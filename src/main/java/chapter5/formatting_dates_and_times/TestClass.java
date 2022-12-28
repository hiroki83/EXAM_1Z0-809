package chapter5.formatting_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestClass {
  public static void main(String[] args) {
    LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
    System.out.println(date1.getDayOfWeek());
    System.out.println(date1.getMonth());
    System.out.println(date1.getYear());
    System.out.println(date1.getDayOfYear());


    LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time2 = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
    System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(time2.format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    

    LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time3 = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    System.out.println(shortDateTime.format(dateTime3));
    System.out.println(shortDateTime.format(date3));
    //System.out.println(shortDateTime.format(time3));// UnsupportedTemporalTypeException

    System.out.println(dateTime3.format(shortDateTime));
    System.out.println(date3.format(shortDateTime));
    //System.out.println(time3.format(shortDateTime));// UnsupportedTemporalTypeException
    

    LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time4 = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime4 = LocalDateTime.of(date4, time4);
    DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    System.out.println(shortF.format(dateTime3));
    System.out.println(mediumF.format(dateTime4));


    DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
    System.out.println(dateTime4.format(f));


    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm");
    System.out.println(f2.format(dateTime4));
    //System.out.println(f2.format(date4));// UnsupportedTemporalTypeException
    System.out.println(f2.format(time4));


    DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date5 = LocalDate.parse("01 02 2015", f3);
    LocalTime time5 = LocalTime.parse("11:22");
    System.out.println(date5);
    System.out.println(time5);
  }
}
