package chapter3.using_new_java8_map_apis;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");
    favorites.put("Tom", null);

    favorites.putIfAbsent("Jenny", "Tram");
    favorites.putIfAbsent("Sam", "Tram");
    favorites.putIfAbsent("Tom", "Tram");
    System.out.println(favorites);
  }
}
