package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;

public class TestCombiningResultsWithReduceMethod {
  public static void main(String ... args) {
    System.out.println("serial stream: " + Arrays.asList('w', 'o', 'l', 'f')
                               .stream()
                               .reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3));
    System.out.println("parallel stream: " + Arrays.asList('w', 'o', 'l', 'f')
                               .parallelStream()
                               .reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3));
    System.out.println("violates requirements case1: " + Arrays.asList(1,2,3,4,5,6)
      .parallelStream()
      .reduce(0,(a,b) -> (a-b)));// NOT AN ASSOCIATIVE ACCUMULATOR
    System.out.println("violates requirements case2: " + Arrays.asList("w", "o", "l", "f")
      .parallelStream()
      .reduce("X",String::concat));
  }
}
