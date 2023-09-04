package reading3rd.chapter5.gmtpariskolkata_p236;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Month;

public class TestClass {
  public static void main(String ... args) {
    ZoneId zoneIdParis = ZoneId.of("Europe/Paris");
    ZoneId zoneIdKolkata = ZoneId.of("Asia/Kolkata");

    LocalDate date = LocalDate.of(2015,Month.JUNE,20);
    LocalTime time1 = LocalTime.of(7,50);
    LocalTime time2 = LocalTime.of(6,50);
    ZonedDateTime paris = ZonedDateTime.of(date, time1, zoneIdParis);
    ZonedDateTime kolkata = ZonedDateTime.of(date, time2, zoneIdKolkata);
    System.out.println(paris);
    System.out.println(kolkata);
  }
}
