package bonus2.q06;

public abstract interface CanSwim {
  int MAX_DISTANCE = 10;
  abstract void swim();
  //default static boolean hasFlippers() {return false;}// DOES NOT COMPILE
  public static int getMaxDistance() { return MAX_DISTANCE;} 
  //public final static void checkSwimmer() {} // DOES NOT COMPILE
  //public final default void checkSwimmer() {} // DOES NOT COMPILE
  //public static final void checkSwimmer1() {} // DOES NOT COMPILE
  //public default final void checkSwimmer2() {} // DOES NOT COMPILE
}
