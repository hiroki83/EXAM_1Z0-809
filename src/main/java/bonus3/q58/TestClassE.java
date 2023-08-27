package bonus3.q58;

public class TestClassE {
  public static void call(Object obj) {}
  public static void main(String ... args) {
    //call(new Thread() { // DOES NOT COMPILE
    //  public void run() {}
    //})
  }
}
