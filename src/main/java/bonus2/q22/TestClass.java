package bonus2.q22;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 10);
    map.put(2, 20);
    map.put(3, null);

    map.merge(1, 3, (a, b) -> null);
    map.merge(3, 3, (a, b) -> null);

    System.out.println(map);
  }
}
