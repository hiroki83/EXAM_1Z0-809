package reading3rd.questions.chapter3.q24;

import java.util.Set;
import java.util.HashSet;

public class TestClassB {
  public static void main(String ... args) {
    Set<String> s = new HashSet<>();
    s.add("lion");
    s.add("tiger");
    s.add("bear");
    //s.forEach(s -> System.out.println(s)); // DOES NOT COMPILE
  }
}
