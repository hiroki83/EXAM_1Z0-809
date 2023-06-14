package bonus1.q36;

public class FourLegged2 {
  String walk = "walk,";
  public void walk() {
    System.out.println(walk);
  }
  static class BabyRhino2 extends FourLegged2 {
    String walk = "toddle,";
    @Override public void walk() {
      System.out.print(walk);
    }
  }
  public static void main(String ... args) {
    FourLegged2 f = new BabyRhino2();
    BabyRhino2 b = new BabyRhino2();
    FourLegged2 h = new FourLegged2();
    f.walk();
    b.walk();
    h.walk();
  }
}
