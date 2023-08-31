package exam1.overrideaccessmodifiers;

public class TestClass extends Shape {
  //private void area1() { // DOES NOT COMPILE
  public void area1() {
    System.out.println("area1 TestClass");
  }
  public void area2() {
    System.out.println("area2 TestClass");
  }
  public static void main(String ... args) {
    Shape o1 = new TestClass();
    TestClass o2 = new TestClass();
    o1.area1();
    o2.area1();
    //o1.area2(); // DOES NOT COMPILE
    o2.area2();
  }
}
