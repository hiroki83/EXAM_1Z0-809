package examtopics.q08;

abstract class Shape {
  Shape() {
    System.out.println("Shape");
  }
  protected void area() {
    System.out.println("Shape");
  }
}

class Square extends Shape {
  int side;
  Square(int side) {
    /* insert code here */
    this.side = side;
  }
}

class Rectangle extends Square {
  int len, br;
  Rectangle(int x, int y) {
    /* insert code here */
    super(x);
    len = x;
    br = y;
  }
  //void area() { // DOES NOT COMPILE
  protected void area() {
    System.out.println("Rectangle");
  }
}

public class TestClass {
  public static void main(String ... args) {
  }
}
