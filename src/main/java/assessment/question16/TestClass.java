package assessment.question16;
import java.time.*;
public class TestClass {
  public static void main(String[] args) {
    String d = Duration.ofDays(1).toString();
    String p = Period.ofDays(1).toString();
    boolean b1 = d == p;
    boolean b2 = d.equals(p);
    System.out.println(b1 + " " + b2);
    System.out.println(d + " " + p);
  }
}
