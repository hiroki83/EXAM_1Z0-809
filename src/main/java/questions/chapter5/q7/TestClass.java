package questions.chapter5.q7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestClass {
  public static void main(String[] args) {
    LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    date.plusDays(2);
    //date.plusHours(3);// COMPILE ERROR
    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
  }
}
