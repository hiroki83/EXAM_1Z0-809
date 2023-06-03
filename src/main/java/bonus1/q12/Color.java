package bonus1.q12;

public class Color {
  private int hue = 10;
  public class Shade {
    public int hue = Color.this.hue;
  }
  public static void main(String ... args) {
    //System.out.println(new Shade().hue);// DOES NOT COMPILE
  }
}
