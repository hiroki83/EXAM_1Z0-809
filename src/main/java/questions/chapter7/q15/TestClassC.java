package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassC {
  public static void main(String ... args) {
    use(()->5);
  }
  private static void use(Callable<Integer> expression) {}
}
