package chapter6.suppressed;

public class TestClass3 {
  public static void main(String[] args) {
    try(JammedTurkeyCage t = new JammedTurkeyCage()) {
      throw new RuntimeException("turkeys ran off");
    } catch(IllegalStateException e) {
      System.out.println("caught: " + e.getMessage());
    }
  }
}
