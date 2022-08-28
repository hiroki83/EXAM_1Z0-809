package chapter3.lower_bounded_wildcards;

import java.util.*;

public class TestClass4 {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
    System.out.println("strings"+strings);
    System.out.println("objects"+objects);
  }
  public static void addSound(List<? super String> list) {
    list.add("quack");
  }
}
