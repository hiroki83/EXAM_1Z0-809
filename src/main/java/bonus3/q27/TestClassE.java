package bonus3.q27;

import java.util.Set;
import java.util.HashSet;

public class TestClassE {
  public static <T extends Set> T work(T t) {
    return t;
  }

  public static void main(String ... args) {
    //Set set = work(new Set()); // DOES NOT COMPILE
  }
}
