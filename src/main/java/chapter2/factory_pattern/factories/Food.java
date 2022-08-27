package chapter2.factory_pattern.factories;

public abstract class Food {
  private int quantity;

  public Food(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public abstract void consumed();
}
