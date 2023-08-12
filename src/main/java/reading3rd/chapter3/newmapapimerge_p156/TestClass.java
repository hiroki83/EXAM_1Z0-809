package reading3rd.chapter3.newmapapimerge_p156;

import java.util.function.BiFunction;
import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");
    favorites.put("Tom", "Tram");
    favorites.put("Sam", null);

    String jenny = favorites.merge("Jenny", "Skyride", mapper);
    String tom = favorites.merge("Tom", "Skyride", mapper);
    String sam = favorites.merge("Sam", "Skyride", mapper);
    String hiroki = favorites.merge("Hiroki", "Skyride", mapper);

    System.out.println(favorites);
    System.out.println(jenny);
    System.out.println(tom);
    System.out.println(sam);
    System.out.println(hiroki);

    BiFunction<String, String, String> mapper2 = (v1, v2) -> null; 
    Map<String, String> favorites2 = new HashMap<>();
    favorites2.put("Jenny", "Bus Tour");
    favorites2.put("Tom", "Bus Tour");
    favorites2.put("Hiroki", null);

    favorites2.merge("Jenny", "Skyride", mapper2);
    favorites2.merge("Sam", "Skyride", mapper2);
    favorites2.merge("Hiroki", "Skyride", mapper2);

    System.out.println(favorites2);
  }
}
