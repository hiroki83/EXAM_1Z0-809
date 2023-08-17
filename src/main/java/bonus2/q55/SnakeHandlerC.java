package bonus2.q55;

public class SnakeHandlerC {
  private Snake snake;
  public void setSnake(Snake snake) { this.snake = snake; }
  public static void main(String ... args) {
    new SnakeHandlerA().setSnake(new Snake());
  }
}
