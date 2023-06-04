package bonus1.q18;

import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String ... args) {
    List list = new ArrayList();
    list.add(1);
    list.add("2");
    list.add(.3);
    print(list);
  }
  private static void print(List<String> list) {
    for (Object object: list)
      System.out.print(object);
    System.out.println();
  }
}
