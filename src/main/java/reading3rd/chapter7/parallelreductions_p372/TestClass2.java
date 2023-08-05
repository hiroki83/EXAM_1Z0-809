package reading3rd.chapter7.parallelreductions_p372;

import java.util.Arrays;

public class TestClass2 {
  public static void main(String ... args) throws InterruptedException {
    // findAny
    System.out.println("findAny()");
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().unordered().findAny().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel().findAny().get());
    Thread.sleep(1000);
    // findFirst
    System.out.println("findFirst()");
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().unordered().findFirst().get());
    System.out.println(Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel().findFirst().get());
    Thread.sleep(1000);
    // skip
    System.out.println("Skip()");
    Arrays.asList(1,2,3,4,5,6).stream().unordered().skip(5).forEach(System.out::print);
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel().skip(5).forEach(System.out::print);
    System.out.println();
    Thread.sleep(1000);
    // limit
    System.out.println("Limit()");
    Arrays.asList(1,2,3,4,5,6).stream().unordered().limit(2).forEach(System.out::print);
    System.out.println();
    Arrays.asList(1,2,3,4,5,6).stream().unordered().limit(2).parallel().forEach(System.out::print);
    System.out.println();
  }
}
