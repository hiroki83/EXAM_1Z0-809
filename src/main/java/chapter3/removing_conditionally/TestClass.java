package chapter3.removing_conditionally;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Magician");
    list.add("Assistant");
    System.out.println(list);
    list.removeIf(s -> s.startsWith("A"));
    System.out.println(list);
  }
}
