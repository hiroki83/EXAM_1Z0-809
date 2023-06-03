package bonus1.q6;

import java.util.stream.IntStream;

public class DragonBoatB {
  private static DragonBoatB boat;
  public static void row() { }
  public static void race() {
    boat = new DragonBoatB();
    IntStream.range(1, 100).forEach(i -> boat.row());
  }
}
