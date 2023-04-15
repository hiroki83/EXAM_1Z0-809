package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassA {
  public static void main(String ... args) {
    //use(a -> {return 10;}); // DOES COMPILE
  }
  private static void use(Callable<Integer> expression) {}
}
