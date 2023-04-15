package questions.chapter7.q15;

import java.util.concurrent.Callable;

public class TestClassF {
  public static void main(String ... args) {
    //use((int count) -> count+1); // NOT COMPILE
  }
  private static void use(Callable<Integer> expression) {}
}
