package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;

public class TestUpperCaseAnimalNames {
  public static void main(String ... args) {
    Arrays.asList("jackal", "kangaroo", "lemur")
      .parallelStream()
      //.map(s -> s.toUpperCase())
      .map(s -> {System.out.println(s); return s.toUpperCase();})
      .forEach(System.out::println);
  }
}
