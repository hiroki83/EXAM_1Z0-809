package chapter7.parallel_streams.reductions;

import java.util.Arrays;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().skip(5).limit(2).findFirst().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().skip(5).limit(2).findFirst().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().skip(5).limit(2).findAny().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().skip(5).limit(2).findAny().get());
    // Real World Scenario
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().unordered().skip(5).findAny().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel().findAny().get());
  }
}
