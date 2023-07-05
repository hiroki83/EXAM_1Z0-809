package bonus1.q50;

public class WhichBrowser {
  class Browser {}
  class Firefox extends Browser {}
  class IE extends Browser {}
  private void check() {
    Browser ref = new IE();
    if (ref instanceof Firefox) {
      System.out.println("Firefox");
    } else if (ref instanceof Browser) {
      System.out.println("Browser");
    } else if (ref instanceof IE) {
      System.out.println("IE");
    } else {
      System.out.println("None of the above");
    }
  }
  public static void main(String ... args) {
    new WhichBrowser().check();
  }
}
