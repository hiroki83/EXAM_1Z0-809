package chapter3.lower_bounded_wildcards;

import java.util.*;

public class TestClass3 {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    //addSound(strings);// DOES NOT COMPILE, with generics, must pass exact match
    addSound(objects);
  }
  public static void addSound(List<Object> list) {
    list.add("quack");
  }
}
