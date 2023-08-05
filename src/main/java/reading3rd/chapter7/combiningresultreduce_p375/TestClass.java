package reading3rd.chapter7.combiningresultreduce_p375;

import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    System.out.println(Arrays.asList(1,2,3,4,5,6)
      .parallelStream()
      .reduce(0,(a,b) -> (a-b))); // NOT AN ASSOCIATIVE ACCUMULATOR
    System.out.println(Arrays.asList(1,2,3,4,5,6)
      .parallelStream()
      .reduce(0,(a,b) -> (a+b)));
    System.out.println(Arrays.asList("w","o","l","f")
      .parallelStream()
      .reduce("X",String::concat));
  }
}
