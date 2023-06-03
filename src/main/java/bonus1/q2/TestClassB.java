package bonus1.q2;

import java.util.function.BiFunction;

public class TestClassB {
  public static void main(String ... args) {
    //(Dolphin d, Fish f) -> {return new Object()};// DOES NOT COMPILE
    BiFunction<Dolphin, Fish, Object> bf = (Dolphin d, Fish f) -> {return new Object();};
  }
}
class Dolphin {}
class Fish {}
