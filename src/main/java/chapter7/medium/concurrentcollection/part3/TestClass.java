package chapter7.medium.concurrentcollection.part3;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    List<Integer>  list = Arrays.asList(new Integer[5]);
    for (int i = 0; i < 10; i++)
      list.add(i);
    System.out.println(list);
  }
}
