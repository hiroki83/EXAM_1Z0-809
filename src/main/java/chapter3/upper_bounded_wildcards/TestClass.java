package chapter3.upper_bounded_wildcards;

import java.util.*;

public class TestClass {

  public static void main(String[] args) {
    ArrayList<Long> test = new ArrayList<>();
    test.add(10L);
    test.add(100L);
    System.out.println(total(test));
  }

  public static long total(List<?extends Number>list) {
    long count = 0;
    for (Number number : list)
      count += number.longValue();
    return count;
  }
}
