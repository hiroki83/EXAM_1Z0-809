package reading3rd.questions.chapter5.q15;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestClass {
  public static void main(String ... args) {
    String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
    String m2 = Duration.ofMinutes(1).toString();
    String s = Duration.of(60, ChronoUnit.SECONDS).toString();

    String d = Duration.ofDays(1).toString();
    String p = Period.ofDays(1).toString();
    System.out.println(m1 + " " + m2 + " " + s + " " + d + " " + p);

    System.out.println(Duration.ofNanos(1000000000));
    System.out.println(Duration.ofMillis(1000));
    System.out.println(Duration.ofSeconds(60));
    System.out.println(Duration.ofMinutes(60));
    System.out.println(Duration.ofHours(25));
    System.out.println(Duration.ofDays(1));
    //System.out.println(Duration.ofHalfDays(3)); // does not exists Duration.ofHalfDays()
  }
}
