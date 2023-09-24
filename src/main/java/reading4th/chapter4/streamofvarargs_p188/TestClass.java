package reading4th.chapter4.streamofvarargs_p188;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class TestClass {
  public static void main(String ... args) {
    //int array[] = new int[3];
    //int array[] = {1,2,3};
    Integer array[] = {1,2,3};
    //String array[] = {"test1", "test2", "test3"};
    Stream<Integer> s1 = Stream.of(array);
    s1.forEach(System.out::print);
    System.out.println();
  }
}
