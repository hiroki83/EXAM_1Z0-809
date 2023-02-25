package chapter3.upper_bounded_wildcards;

import java.util.*;

public class TestClass {

  public static void main(String[] args) {
    ArrayList<Long> test = new ArrayList<>();
    test.add(10L);
    test.add(100L);
    System.out.println(total(test));
    ArrayList<Number> test2 = new ArrayList<>();
    test2.add(10);
    test2.add(100);
    System.out.println(total(test2));
  }

  public static long total(List<?extends Number>list) {
    long count = 0;
    for (Number number : list)
      count += number.longValue();
    return count;
  }
}
