package chapter3.genericinterfaces;

public class ShippableRobotCrate implements Shippable<Robot> {
  public void ship(Robot t) {}
}
class Robot {}
