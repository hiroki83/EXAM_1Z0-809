package chapter7.parallel_streams;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestClass {
  public static void main(String[] args) {
    Arrays.asList(1,2,3,4,5,6).stream().forEach(s -> System.out.print(s+" "));
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(s -> System.out.print(s+" "));
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s -> System.out.print(s+" "));
    System.out.println();
    // Understanding Independent Operations
    Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> s.toUpperCase()).forEach(System.out::println);
    Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> {System.out.println(s); return s.toUpperCase();}).forEach(System.out::println);
    // Avoiding Stateful Operations
    List<Integer> data = Collections.synchronizedList(new ArrayList<>());
    Arrays.asList(1,2,3,4,5,6).parallelStream()
      .map(i -> {data.add(i); return i;}) // AVOID STATEFUL LAMBDA EXPRESSIONS!
      .forEachOrdered(i -> System.out.print(i+" "));

    System.out.println();
    for(Integer e: data) {
      System.out.print(e+" ");
    }
    System.out.println();

    // Real World Scenario
    // Using Concurrent Collections with Parallel Streams
    List<Integer> data2 = new ArrayList<>();
    Arrays.asList(1,2,3,4,5,6).parallelStream()
      .map(i -> {data2.add(i); return i;}) // AVOID STATEFUL LAMBDA EXPRESSIONS!
      .forEachOrdered(i -> System.out.print(i+" "));

    System.out.println();
    for(Integer e: data2) {
      System.out.print(e+" ");
    }
    System.out.println();
  }
}
