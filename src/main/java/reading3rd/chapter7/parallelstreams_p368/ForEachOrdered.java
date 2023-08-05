package reading3rd.chapter7.parallelstreams_p368;

import java.util.Arrays;

public class ForEachOrdered {
  public static void main(String ... args) {
    Arrays.asList(1,2,3,4,5,6)
      .parallelStream()
      .forEachOrdered(s -> System.out.print(s+" "));
  }
}
