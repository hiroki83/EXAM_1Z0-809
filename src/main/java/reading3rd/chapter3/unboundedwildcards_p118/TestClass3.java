package reading3rd.chapter3.unboundedwildcards_p118;

import java.util.List;
import java.util.ArrayList;

public class TestClass3 {
  public static void printList(List<?> list) {
    for(Object x : list) System.out.println(x);
    //list.add(new Object()); // DOES NOT COMPILE
    //list.add("");// DOES NOT COMPILE unbounded generics immutable
  }
  public static void main(String ... args) {
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
    printList(keywords);
  }
}
