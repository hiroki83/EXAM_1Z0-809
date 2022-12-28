package chapter3.looping_through_a_collection;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    List<String> cats = Arrays.asList("Annie", "Ripley");
    cats.forEach(c -> System.out.println(c));
  }
}
