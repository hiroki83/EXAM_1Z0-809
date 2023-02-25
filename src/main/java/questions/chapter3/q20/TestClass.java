package questions.chapter3.q20;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String[] args) {
    Map m = new HashMap();
    m.put(123, "456");
    m.put("abc", "def");
    //System.out.println(m.contains("123"));// COMPILE ERROR
    System.out.println(m.containsValue("123"));
    System.out.println(m.containsKey("123"));
  }
}
