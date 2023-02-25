package questions.chapter3.q24;

import java.util.Set;
import java.util.HashSet;

public class TestClass {
  public static void main(String[] args) {
    Set<String> s = new HashSet<>();
    s.add("lion");
    s.add("tiger");
    s.add("bear");
    //s.forEach(() -> System.out.println(s));// COMPILE ERROR
    //s.forEach(s -> System.out.println(s));// COMPILE ERROR
    //s.forEach((s) -> System.out.println(s));// COMPILE ERROR
    //s.forEach(System.out.println(s));
    s.forEach(System.out::println);
    s.forEach(t -> System.out.println(t));
  }
}
