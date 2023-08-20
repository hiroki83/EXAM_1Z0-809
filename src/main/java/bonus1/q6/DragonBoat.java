package bonus1.q6;

import java.util.stream.IntStream;

public class DragonBoat {
  private DragonBoat boat;
  public static void row() { }
  public static void race() {
    DragonBoat boat = new DragonBoat();
    //IntStream.range(1, 100).forEach(i -> boat.row());// DOES NOT COMPILE
  }
}
