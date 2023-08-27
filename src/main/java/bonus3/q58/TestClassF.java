package bonus3.q58;

public class TestClassF {
  public static void call(Object obj) {}
  public static void main(String ... args) {
    call(new Thread() {
      public void run() {}
    });
  }
}
