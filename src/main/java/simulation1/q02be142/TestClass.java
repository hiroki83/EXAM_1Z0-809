package simulation1.q02be142;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1,10);
    map.put(2,20);
    map.put(3, null);

    //map.merge(1, 3, v -> v);
    //map.merge(3, 3, v -> v);
    map.merge(1, 3, (k, v) -> v);
    map.merge(3, 3, (k, v) -> v);

    System.out.println(map);
  }
}
