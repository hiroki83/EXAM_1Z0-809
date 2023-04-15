package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassB {
  public static void main(String ... args) {
    //use(() -> {String s = "";}); // NOT COMPILE
  }
  private static void use(Callable<Integer> expression) {}
}
