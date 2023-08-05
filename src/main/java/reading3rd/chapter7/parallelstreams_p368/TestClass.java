package reading3rd.chapter7.parallelstreams_p368;

import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    Arrays.asList(1,2,3,4,5,6)
      .parallelStream()
      .forEach(s -> System.out.print(s+" "));
  }
}
