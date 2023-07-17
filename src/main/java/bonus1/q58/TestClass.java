package bonus1.q58;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    List<? extends Object> list = Arrays.asList("YASU");
    //list.add("HIROKI");// DOES NOT COMPILE
    for (Object name : list)
      System.out.println(name);
    add(list);
  }
  public static void add(List<?> list) {
    //list.add("Hiroki");// DOES NOT COMPILE
  }
}
