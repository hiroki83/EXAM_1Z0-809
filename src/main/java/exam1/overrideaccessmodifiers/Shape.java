package exam1.overrideaccessmodifiers;

public abstract class Shape {
  Shape() {
    System.out.println("Shape");
  }
  protected void area1() {
    System.out.println("area1 Shape");
  }
  private void area2() {
    System.out.println("area2 Shape");
  }
}
