package bonus2.q55;

import java.util.List;
import java.util.Arrays;

public class TestClassF {
  //private List<Snake> snake; // DOES NOT COMPILE
  private List<? extends Snake> snake;
  //public void setSnake(List<Snake> snake) { this.snake = snake; } // DOES NOT COMPILE
  public void setSnake(List<? extends Snake> snake) { this.snake = snake;}
  public static void main(String ... args) {
    new TestClassA().setSnake(null);
  }
}
