package bonus2.q41;

public class C<A> {
  A a;
  //public void m(A a) {// DOES NOT COMPILE because during compile generic A become Object(thanks of erasure) end then exist 2 methods have a same signature.
  //  System.out.println("a");
  //}
  public void m(Object o) {
    System.out.println("obj");
  }
  public static void main(String ... args) {
    C<String> c = new C<>();
    c.m("s");
  }
}
