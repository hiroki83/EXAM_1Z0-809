package questions.chapter3.q18;

public class TestClass {
}

class A {}
class B extends A {}
class C extends B {}

class D<C> {
  A a1 = new A();
  A a2 = new B();
  //A a3 = new C();// COMPILE ERROR unexpected type
  //C c1 = new A();// COMPILE ERROR
  //C c2 = new B();// COMPILE ERROR
  //C c3 = new C();// COMPILE ERROR unexpected type
}
