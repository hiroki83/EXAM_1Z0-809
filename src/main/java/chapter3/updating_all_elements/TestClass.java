package chapter3.updating_all_elements;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3);
    list.replaceAll(x -> x*2);
    System.out.println(list);
  }
}
