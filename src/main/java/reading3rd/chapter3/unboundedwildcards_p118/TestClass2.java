package reading3rd.chapter3.unboundedwildcards_p118;

import java.util.List;
import java.util.ArrayList;

public class TestClass2 {
  public static void printList(List<?> list) {
    for(Object x : list) System.out.println(x);
  }
  public static void main(String ... args) {
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
    printList(keywords);
  }
}
