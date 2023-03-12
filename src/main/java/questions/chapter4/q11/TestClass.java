package questions.chapter4.q11;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String ... args) {
    //Stream.iterate(1, x -> x++).limit(5).map(x -> x).collect(Collectors.joining());// COMPILE ERROR
    //Stream.iterate(1, x -> x++).limit(5).map(x -> x).collect(Collectors.joining(""));// COMPILE ERROR
    //System.out.print(Stream.iterate(1, x -> x++).limit(5).map(x -> "" + x).collect(Collectors.joining()));// print 11111
    System.out.print(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));// print 12345
    //Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()).forEach(System.out::print);// COMPILE ERROR
  }
}
