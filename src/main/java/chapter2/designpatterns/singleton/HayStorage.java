package chapter2.designpatterns.singleton;

public class HayStorage {
  private int quantity = 0;
  private HayStorage() {}

  private static final HayStorage instance = new HayStorage();

  public static HayStorage getInstance() {
    return instance;
  }
  public synchronized void addHay(int amount) {
    this.quantity += amount;
  }
  public synchronized boolean removeHay(int amount) {
    if(this.quantity < amount) return false;
    this.quantity -= amount;
    return true;
  }
  public synchronized int getHayQuantity() {
    return this.quantity;
  }
}
