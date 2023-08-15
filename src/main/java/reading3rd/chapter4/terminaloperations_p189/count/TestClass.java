package reading3rd.chapter4.terminaloperations_p189.count;

import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    System.out.println(s.count());
  }
}
