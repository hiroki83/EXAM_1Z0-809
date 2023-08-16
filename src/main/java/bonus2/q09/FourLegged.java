package bonus2.q09;

public class FourLegged {
  String walk = "walk,";
  public void walk() {
    System.out.println(walk);
  }
  static class BabyRhino extends FourLegged {
    //@Override String walk = "toddle,";// DOES NOT COMPILE
    String walk = "toddle,";
    @Override public void walk() {
      System.out.print(walk);
    }
  }
  public static void main(String ... args) {
    FourLegged f = new BabyRhino();
    BabyRhino b = new BabyRhino();
    f.walk();
    b.walk();
  }
}
