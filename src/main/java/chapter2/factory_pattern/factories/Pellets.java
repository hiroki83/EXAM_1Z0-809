package chapter2.factory_pattern.factories;

public class Pellets extends Food {
  public Pellets(int quantity) {
    super(quantity);
  }

  public void consumed() {
    System.out.println("Pellets eaten: "+getQuantity());
  }
}
