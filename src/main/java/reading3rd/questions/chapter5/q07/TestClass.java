package reading3rd.quesitions.chapter5.q07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestClass {
  public static void main(String ... args) {
    LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    date.plusDays(2);
    //date.plusHours(3); // DOES NOT COMPILE
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
  }
}
