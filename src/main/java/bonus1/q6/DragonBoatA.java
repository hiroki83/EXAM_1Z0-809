package bonus1.q6;

import java.util.stream.IntStream;

public class DragonBoatA {
  private DragonBoatA boat;
  public static void row() { }
  public static void race() {
    //boat = new DragonBoatA();// DOES NOT COMPILE
    //IntStream.range(1, 100).forEach(i -> boat.row());// DOES NOT COMPILE
  }
}
