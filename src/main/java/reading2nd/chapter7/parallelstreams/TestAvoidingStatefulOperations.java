package reading2nd.chapter7.parallelstreams;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestAvoidingStatefulOperations {
  public static void main(String ... args) {
    //List<Integer> data = Collections.synchronizedList(new ArrayList<>());
    List<Integer> data = new ArrayList<>();
    Arrays.asList(1,2,3,4,5,6).parallelStream()
      .map(i -> {data.add(i); return i;}) // AVOID STATEFUL LAMBDA EXPRESSIONS!
      .forEachOrdered(i -> System.out.print(i+" "));

    System.out.println();
    for(Integer e : data) {
      System.out.print(e+" ");
    }
  }
}
