package chapter6.suppressed;

public class JammedTurkeyCage implements AutoCloseable {
  //public void close() throws IllegalStateException {
  public void close() {
    throw new IllegalStateException("Cage door does not close");
  }
  public static void main(String[] args) {
    try(JammedTurkeyCage t = new JammedTurkeyCage()) {
    } catch(IllegalStateException e) {
      System.out.println("caught: " + e.getMessage());
    }
  }
}
