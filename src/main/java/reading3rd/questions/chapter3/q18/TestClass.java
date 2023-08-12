package reading3rd.questions.chapter3.q18;

class A {}
class B extends A {}
class C extends B {}
class D<C> {
  A a1 = new A();
  A a2 = new B();
  //A a3 = new C();// DOES NOT COMPILE
  //C c1 = new A();// DOES NOT COMPILE
  //C c2 = new B();// DOES NOT COMPILE
  //C c3 = new C();// DOES NOT COMPILE
}
public class TestClass {
  public static void main(String ... args) {
  }
}
