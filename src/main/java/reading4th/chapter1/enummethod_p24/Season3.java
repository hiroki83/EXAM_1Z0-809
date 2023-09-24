package reading4th.chapter1.enummethod_p24;

public enum Season3 {
  WINTER {
    public void printHours() {
      System.out.println("short hours");
    }
  }, SUMMER {
    public void printHours() {
      System.out.println("long hours");
    }
  }, SPRING, FALL;
  public void printHours() {
    System.out.println("default hours");
  }
}
class TestClass {
  public static void main(String ... args) {
    Season3 winter = Season3.WINTER;
    winter.printHours();
  }
}
