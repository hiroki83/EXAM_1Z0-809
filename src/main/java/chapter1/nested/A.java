package chapter1.nested;

public class A {
  private int x = 10;
  public class B {
    private int x = 20;
    public class C {
      private int x = 30;
      public void allTheX() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(B.this.x);
        System.out.println(A.this.x);
      }
    }
  }
  public static void main(String[] args) {
    A a = new A();
    A.B b = a.new B();
    A.B.C c = b.new C();
    c.allTheX();
  }
}
