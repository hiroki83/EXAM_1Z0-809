package chapter3.array_and_arraylist;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    String[] array = {"gerbil","mouse"};
    List<String> list = Arrays.asList(array);
    list.set(1, "test");
    System.out.println("list.get(0): "+list.get(0));
    array[0] = "new";
    String[] array2 = (String[]) list.toArray();
    System.out.println("list.get(0): "+list.get(0));
    //list.remove(1);
  }
}
