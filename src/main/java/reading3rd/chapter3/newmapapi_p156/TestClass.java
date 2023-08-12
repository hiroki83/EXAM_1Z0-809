package reading3rd.chapter3.newmapapi_p156;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");

    favorites.put("Jenny", "Tram");
    System.out.println(favorites);

    Map<String, String> favorites2 = new HashMap<>();
    favorites2.put("Jenny", "Bus Tour");
    favorites2.put("Tom", null);

    favorites2.putIfAbsent("Jenny", "Tram");
    favorites2.putIfAbsent("Sam", "Tram");
    favorites2.putIfAbsent("Tom", "Tram");
    System.out.println(favorites2);
  }
}
