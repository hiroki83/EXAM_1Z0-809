package chapter2.designinginterface;

public class Lion implements Run {
  public boolean isQuadruped() {
    return true;
  }
  public boolean canHuntWhileRunning() {
    return true;
  }
  public double getMaxSpeed() {
    return 100;
  }
}
