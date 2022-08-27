package chapter2.factory_pattern.factories;

public class Fish extends Food {
  Fish(int quantity) {
    super(quantity);
  }

  public void consumed() {
    System.out.println("Fish eaten: "+getQuantity());
  }
}
