package examtopics.q02;

import java.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class TestClass {
  public static void main(String ... args) {
    IntStream stream = IntStream.of(1,2,3);
    //IntFunction<Integer> inFu = x -> y -> x * y; // line n1 DOES NOT COMPILE
    IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;
    IntStream newStream = stream.map(inFu.apply(10)); // line n2
    newStream.forEach(System.out::print);
  }
}
