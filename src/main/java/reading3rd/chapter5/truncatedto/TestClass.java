package reading3rd.chapter5.truncatedto;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestClass {
  public static void main(String ... args) {
    LocalDateTime now = LocalDateTime.now();
    //System.out.println(now.truncatedTo(ChronoUnit.MONTHS)); // throws UnsupportedTemporalTypeException at runtime
    System.out.println(now.truncatedTo(ChronoUnit.MINUTES));
    System.out.println(now.truncatedTo(ChronoUnit.HOURS));
    System.out.println(now.truncatedTo(ChronoUnit.DAYS));
    System.out.println(now.truncatedTo(ChronoUnit.YEARS));
  }
}
