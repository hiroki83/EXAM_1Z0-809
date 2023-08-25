package bonus3.q27;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayDeque;

public class TestClassD {
  public static <T extends Set> T work(T t) {
    return t;
  }

  public static void main(String ... args) {
    //Set set = work(new ArrayDeque()); // DOES NOT COMPILE
  }
}
