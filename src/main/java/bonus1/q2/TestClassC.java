package bonus1.q2;

import java.util.function.Function;

public class TestClassC {
  public static void main(String ... args) {
    //Function<Kangaroo, Kangaroo> f = Kangaroo w -> new Kangaroo();// DOES NOT COMPILE
    Function<Kangaroo, Kangaroo> f = (Kangaroo w) -> new Kangaroo();
  }
}
class Kangaroo {}
