package examtopics.q16;

import java.util.Map;
import java.util.TreeMap;

public class TestClass {
  public static void main(String ... args) {
    Map<Integer, String> books = new TreeMap<>();
    books.put(1007, "A");
    books.put(1002, "C");
    books.put(1001, "B");
    books.put(1003, "B");
    System.out.println(books);
  }
}
