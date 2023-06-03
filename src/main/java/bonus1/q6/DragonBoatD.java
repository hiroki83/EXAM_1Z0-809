package bonus1.q6;

import java.util.stream.IntStream;

public class DragonBoatD {
  public static DragonBoatD boat;
  public static void row() { }
  public static void race() {
    boat = new DragonBoatD();
    IntStream.range(1, 100).forEach(i -> boat.row());
  }
}
