package chapter3.lower_bounded_wildcards;

import java.util.*;

public class TestClass2 {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
  }
  public static void addSound(List<? extends Object> list) {
    //list.add("quack");// DOES NOT COMPILE, upper-bounded generics are immutable
  }
}
