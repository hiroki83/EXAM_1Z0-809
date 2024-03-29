package chapter6.suppressed;

public class TestClass4 {
  public static void main(String[] args) {
    try(JammedTurkeyCage t1 = new JammedTurkeyCage(); JammedTurkeyCage t2 = new JammedTurkeyCage()) {
      System.out.println("turkeys entered cages");
    } catch(IllegalStateException e) {
      System.out.println("caught: " + e.getMessage());
      for (Throwable t: e.getSuppressed())
        System.out.println(t.getMessage());
    }
  }
}
