package reading3rd.questions.chapter3.q20;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map m = new HashMap(2);
    m.put(123, "456");
    m.put("abc", "def");
    //System.out.println(m.contains("123")); // DOES NOT COMPILE
    System.out.println(m.containsKey("123")); // false
    System.out.println(m.containsKey(123)); // true
  }
}
