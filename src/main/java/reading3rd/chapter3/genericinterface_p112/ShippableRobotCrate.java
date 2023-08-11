package reading3rd.chapter3.genericinterface_p112;

class Robot {}
public class ShippableRobotCrate implements Shippable<Robot> {
  public void ship(Robot t) {}
}
