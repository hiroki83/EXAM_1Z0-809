package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassD {
  public static void main(String ... args) {
    //use(() -> {return null}); // NOT COMPILE
  }
  private static void use(Callable<Integer> expression) {}
}
