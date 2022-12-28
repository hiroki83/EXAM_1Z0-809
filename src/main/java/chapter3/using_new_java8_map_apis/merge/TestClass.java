package chapter3.using_new_java8_map_apis.merge;

import java.util.*;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    BiFunction<String, String, String> mapper1 = (v1, v2) -> v1.length() > v2.length() ? v1: v2;
    BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
    Map<String, String> favorites1 = new HashMap<>();
    favorites1.put("Jenny","Bus Tour");
    favorites1.put("Tom","Tram");

    Map<String, String> favorites2 = new HashMap<>();
    favorites2.put("Sam", null);

    Map<String, String> favorites3 = new HashMap<>();
    favorites3.put("Jenny", "Bus Tour");
    favorites3.put("Tom", "Bus Tour");
    favorites3.put("Hiroki", null);

    String jenny = favorites1.merge("Jenny", "Skyride", mapper1);
    String tom = favorites1.merge("Tom", "Skyride", mapper1);

    favorites2.merge("Tom", "Skyride", mapper1);
    favorites2.merge("Sam", "Skyride", mapper1);

    favorites3.merge("Jenny", "Skyride", mapper2);
    favorites3.merge("Sam", "Skyride", mapper2);
    favorites3.merge("Hiroki", "Skyride", mapper2);

    System.out.println(favorites1);
    System.out.println(jenny);
    System.out.println(tom);

    System.out.println(favorites2);

    System.out.println(favorites3);
  }
}
