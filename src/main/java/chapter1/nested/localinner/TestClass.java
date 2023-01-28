package chapter1.nested.localinner;

public class TestClass {
  public void isItFinal() {
    int one = 20;
    int two = one;
    two++;
    int three;
    if (one == 4) three = 3;
    else three =4;
    int four = 4;
    class Inner {
      int five = one;
      //int six = two;// COMPILE ERROR local variables referenced from an inner class must be final or effectively final.
      //int one = 40;// COMPILE ERROR illegal forward reference.
      private static final int one = 40;
    }
    four = 5;
  }
}
