package reading3rd.questions.chapter3.q24;

import java.util.Set;
import java.util.HashSet;

public class TestClassE {
  public static void main(String ... args) {
    Set<String> s = new HashSet<>();
    s.add("lion");
    s.add("tiger");
    s.add("bear");
    //s.forEach(System::out::println); // DOES NOT COMPILE
  }
}
