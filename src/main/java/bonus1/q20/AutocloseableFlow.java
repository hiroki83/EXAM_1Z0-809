package bonus1.q20;

import java.io.Closeable;

public class AutocloseableFlow {
  static class Door implements AutoCloseable{
    public void close() {
      System.out.print("D");
      throw new RuntimeException();
    }
  }
  static class Window implements Closeable{
    public void close() {
      System.out.print("W");
      throw new RuntimeException();
    }
  }
  public static void main(String ... args) {
    try (Door d = new Door(); Window w = new Window()) {
      System.out.print("T");
      throw new RuntimeException();
    } catch (Exception e) {
      System.out.print("E");
    } finally {
      System.out.println("F");
    }
  }
}
