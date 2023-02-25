package chapter3.genericinterfaces;

public class ShippableAbstractCrate<U> implements Shippable<U> {
//public class ShippableAbstractCrate implements Shippable<U> {// DOES NOT COMPILE
  public void ship(U t) {}
}
