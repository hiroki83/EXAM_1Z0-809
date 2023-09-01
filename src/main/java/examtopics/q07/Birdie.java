package examtopics.q07;

import java.util.function.Supplier;

class Bird{
  public void fly() {
    System.out.println("Can fly");
  }
}

class Penguin extends Bird {
  public void fly() {
    System.out.println("Cannot fly");
  }
}

public class Birdie {
  public static void main(String ... args) {
    fly(() -> new Bird());
    fly(Penguin::new);
  }
  /* line n1 */
  static void fly(Supplier<? extends Bird> bird) {
    bird.get().fly();
  }
}
