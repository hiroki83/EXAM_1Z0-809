package reading3rd.chapter4.terminaloperations_p189.foreach;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
    s.forEach(System.out::println);
    Stream s1 = Stream.of(1);
    //for (Integer i: s) {} // DOES NOT COMPILE
  }
}
