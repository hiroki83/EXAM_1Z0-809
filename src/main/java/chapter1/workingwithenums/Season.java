package chapter1.workingwithenums;

public enum Season {
  WINTER("Low"), SPRING("Medium"), SUMMER("Hight"), FALL("Medium");
  private String expectedVisitors;
  private Season(String expectedVisitors) {
  //public Season(String expectedVisitors) {// COMPILE ERROR: modifier public not allowed here
    this.expectedVisitors = expectedVisitors;
  }
  public void printExpectedVisitors() {
    System.out.println(expectedVisitors);
  }
}
