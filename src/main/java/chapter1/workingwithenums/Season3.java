package chapter1.workingwithenums;

public enum Season3 {
  WINTER {
    public void printHours() { System.out.println("short hours");}
  }, SUMMER {
    public void printHours() { System.out.println("long hours");}
  }, SPRING, FALL;
  public void printHours() { System.out.println("default hours");}
}
