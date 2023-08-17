package bonus2.q33;

public class FourLegged {
  String walk = "walk,";
  public void walk() {
    System.out.println(walk);
  }
  static class BabyRhino extends FourLegged {
    String walk = "toddle,";
  }
  public static void main(String ... args) {
    FourLegged f = new BabyRhino();
    BabyRhino b = new BabyRhino();
    f.walk();
    b.walk();
  }
}
