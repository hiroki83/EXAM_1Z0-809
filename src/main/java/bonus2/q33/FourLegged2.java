package bonus2.q33;

public class FourLegged2 {
  String walk = "walk,";
  public void walk() {
    System.out.println(walk);
  }
  static class BabyRhino extends FourLegged2 {
    String walk = "toddle,";
    @Override
    public void walk() {
      System.out.println(walk);
    }
  }
  public static void main(String ... args) {
    FourLegged2 f = new BabyRhino();
    BabyRhino b = new BabyRhino();
    f.walk();
    b.walk();
  }
}
