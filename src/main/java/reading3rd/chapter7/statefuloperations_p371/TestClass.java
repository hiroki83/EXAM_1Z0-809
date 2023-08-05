package reading3rd.chapter7.statefuloperations_p371;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestClass {
  public static void main(String ... args) {
    List<Integer> data = Collections.synchronizedList(new ArrayList<>());
    Arrays.asList(1,2,3,4,5,6).parallelStream()
      .map(i -> {data.add(i); return i;}) // AVOID STATEFUL LAMBDA EXPRESSIONS!
      .forEachOrdered(i -> System.out.print(i+" "));

    System.out.println();
    for(Integer e: data) {
      System.out.print(e + " ");
    }
  }
}
