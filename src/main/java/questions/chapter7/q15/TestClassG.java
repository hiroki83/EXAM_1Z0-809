package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassG {
  public static void main(String ... args) {
    use(() -> {System.out.println("Giraffe"); return 10;});
  }
  private static void use(Callable<Integer> expression) {}
}
