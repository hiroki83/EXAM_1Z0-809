package bonus3.q58;

public class TestClassC {
  public static void call(Object obj) {}
  public static void main(String ... args) {
    call(new Runnable() {
      public void run() {}
    });
  }
}
