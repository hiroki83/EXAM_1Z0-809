package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassE {
  public static void main(String ... args) {
    use(() -> "The" + "Zoo");
  }
  private static void use(Callable<String> expression) {}
}
