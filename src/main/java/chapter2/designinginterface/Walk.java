package chapter2.designinginterface;

public interface Walk {
  boolean isQuadruped();
  //static int getQuadruped();// COMPILE ERROR
  abstract double getMaxSpeed();
}
