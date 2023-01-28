package chapter1.nested;

import chapter1.nested.Outer.Inner;

public class TestClass {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Inner inner = outer.new Inner();
    inner.go();
  }
}
