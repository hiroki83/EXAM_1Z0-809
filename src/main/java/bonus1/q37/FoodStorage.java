package bonus1.q37;

public class FoodStorage {
  //private synchronized int apples;
  private int apples;
  public synchronized int getAppleCount() { return apples;}
  public synchronized void stock(int applesToStock) { apples += applesToStock;}
  public synchronized void eaten(int eatenCount) {
    synchronized (this) {
      apples -= eatenCount;
    }
  }
}
