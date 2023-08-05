package reading3rd.chapter7.independentoperations_p370;

import java.util.Arrays;

public class TestClass2 {
  public static void main(String ... args) {
    Arrays.asList("jackal", "kangaroo", "lemur")
      .parallelStream()
      .map(s -> {System.out.println(s); return s.toUpperCase();})
      .forEach(System.out::println);
  }
}
