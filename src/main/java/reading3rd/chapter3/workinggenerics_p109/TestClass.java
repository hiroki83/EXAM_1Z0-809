package reading3rd.chapter3.workinggenerics_p109;

import java.util.List;
import java.util.ArrayList;

public class TestClass {
  static void printNames(List list) {
    for(int i = 0; i < list.size(); i++) {
      String name = (String) list.get(i);
      System.out.println(name);
    }
  }
  public static void main(String ... args) {
    List names = new ArrayList();
    names.add(new StringBuilder("Webby"));
    printNames(names);
  }
}
