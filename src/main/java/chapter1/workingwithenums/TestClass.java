package chapter1.workingwithenums;

public class TestClass {
  public static void main(String[] args) {
    Season.SUMMER.printExpectedVisitors();
    Season2 season2 = Season2.SUMMER;
    Season2.SUMMER.printHours();
    Season3.SPRING.printHours();
  }
}
