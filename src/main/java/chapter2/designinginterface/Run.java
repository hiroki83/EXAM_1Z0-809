package chapter2.designinginterface;

public interface Run extends Walk {
  public abstract boolean canHuntWhileRunning();
  abstract double getMaxSpeed();
}
