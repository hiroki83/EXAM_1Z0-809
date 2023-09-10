package reading3rd.chapter5.datetimeformatter_p271;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TestClass {
  public static void main(String ... args) {
    DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    DateTimeFormatter longDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    DateTimeFormatter fullDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
    System.out.println(shortDate.format(LocalDateTime.now()));
    System.out.println(shortTime.format(LocalDateTime.now()));
    System.out.println(shortDateTime.format(LocalDateTime.now()));
    //System.out.println(longDateTime.format(LocalDateTime.now()));// throws an exception at runtime
    //System.out.println(fullDateTime.format(LocalDateTime.now()));// throws an exception at runtime
    System.out.println(longDateTime.format(ZonedDateTime.now()));
    System.out.println(fullDateTime.format(ZonedDateTime.now()));

    //DateTimeFormatter defaultDateTime = DateTimeFormatter.ofLocalizedDateTime(); // DOES NOT COMPILE
    System.out.println();
    System.out.println(LocalDateTime.parse("2023-09-10T17:31:00"));
    //System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse("2023-09-10T17:31:00"));
    System.out.println(LocalDateTime.parse("2023-09-10T17:31:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    //System.out.println(fullDateTime.parse("2023-09-10T17:31:00"));
    System.out.println(ZonedDateTime.parse("Sunday, September 10, 2023 5:31:54 PM CEST", fullDateTime));
    System.out.println(LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2018-03-09")));
  }
}
