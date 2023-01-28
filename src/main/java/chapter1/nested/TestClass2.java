package chapter1.nested;

import chapter1.Outer;

public class TestClass2 extends Outer {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.callInner();
    //Inner inner = new Inner();// COMPILE ERROR non-static variable this cannot be referenced from a static context.
  }
}
