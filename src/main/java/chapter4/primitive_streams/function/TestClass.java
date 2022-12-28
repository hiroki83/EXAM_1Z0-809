package chapter4.primitive_streams.function;

import java.util.stream.Stream;
import java.util.function.ToIntFunction;

public class TestClass {
  public static void main(String[] args) {
    double d = 1.0;
    ToIntFunction f1 = x -> 1;
    System.out.println(f1.applyAsInt(d));
  }
}
