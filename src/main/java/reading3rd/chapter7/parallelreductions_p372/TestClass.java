package reading3rd.chapter7.parallelreductions_p372;

import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) throws InterruptedException {
    // findAny
    System.out.println("findAny()");
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
    Thread.sleep(1000);
    // findFirst
    System.out.println("findFirst()");
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findFirst().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findFirst().get());
    Thread.sleep(1000);
    // skip
    System.out.println("Skip()");
    Arrays.asList(1,2,3,4,5,6).stream().skip(5).forEach(System.out::print);
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).parallelStream().skip(5).forEach(System.out::print);
    System.out.println();
    Thread.sleep(1000);
    // limit
    System.out.println("Limit()");
    Arrays.asList(1,2,3,4,5,6).stream().limit(2).forEach(System.out::print);
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).parallelStream().limit(2).forEach(System.out::print);
    System.out.println();
  }
}
