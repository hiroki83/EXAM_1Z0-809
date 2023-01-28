package chapter1.nested.localinner;

public class Outer {
  private int length = 5;
  public void calculate() {
    int width = 20;// effectively final
    //final int width = 20;
    class Inner extends Father implements Mother {
      public void multiply() {
        System.out.println(length * width);
      }
    }
    Inner inner = new Inner();
    inner.multiply();
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.calculate();
  }
}
