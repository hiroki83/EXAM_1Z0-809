package chapter2.factory_pattern.factories;

public class Hay extends Food {
  public Hay(int quantity) {
    super(quantity);
  }

  public void consumed() {
    System.out.println("Hay eaten: "+getQuantity());
  }
}
