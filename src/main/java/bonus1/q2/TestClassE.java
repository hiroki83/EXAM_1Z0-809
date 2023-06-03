package bonus1.q2;

import java.util.function.Function;

public class TestClassE {
  public static void main(String ... args) {
    //Function<Whale, Whale> f = (Whale w) -> {int w = 3; return w;};// DOES NOT COMPILE
    Function<Whale, Whale> f = (Whale w) -> {int i = 3; return w;};
  }
}
class Whale {}
