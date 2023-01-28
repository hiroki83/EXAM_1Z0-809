package chapter1.workingwithenums;

public enum OnlyOne {
  ONCE(true);
  private OnlyOne(boolean b) {
    System.out.println("constructing");
  }
  public static void main(String[] args) {
    OnlyOne firstCall = OnlyOne.ONCE;
    OnlyOne secondCall = OnlyOne.ONCE;
  }
}
