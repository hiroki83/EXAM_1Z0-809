package bonus3.q47;

public class LandscapeTracker {
  private transient int flowers;
  public int getFlowers() { return flowers; }
  public synchronized void addFlowers(int x) { // q1
    flowers += x;
  }
  public void removeFlowers(int x) {
    synchronized(this) { // q2
      flowers -= x;
    }
  }
  public static void main(String ... args) {
  }
}
