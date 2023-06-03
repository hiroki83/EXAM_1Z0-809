package bonus1.q2;

import java.util.function.BiFunction;

public class TestClassA {
  public static void main(String ... args) {
    //a,b -> a;// DOES NOT COMPILE
    BiFunction<String, String, String> bf = (a,b) -> a;
  }
}
