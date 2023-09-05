package reading3rd.chapter5.gmtpariskolkata_p236;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestClass {
  public static void main(String ... args) {
    ZoneId zoneIdParis = ZoneId.of("Europe/Paris");
    ZoneId zoneIdKolkata = ZoneId.of("Asia/Kolkata");

    LocalDate date = LocalDate.of(2015,Month.JUNE,20);
    LocalTime time1 = LocalTime.of(7,50);
    LocalTime time2 = LocalTime.of(6,50);

    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss z");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss Z");
    DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss O");
    DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss OOOO");
    ZonedDateTime paris = ZonedDateTime.of(date, time1, zoneIdParis);
    ZonedDateTime kolkata = ZonedDateTime.of(date, time2, zoneIdKolkata);
    System.out.println(paris);
    System.out.println(kolkata);
    System.out.println(formatter1.format(paris));
    System.out.println(formatter2.format(paris));
    System.out.println(formatter3.format(paris));
    System.out.println(formatter4.format(paris));
    System.out.println(formatter5.format(paris));
  }
}
