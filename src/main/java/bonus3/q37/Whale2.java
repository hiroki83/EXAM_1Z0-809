package bonus3.q37;

import java.io.Serializable;

public class Whale2 extends Mammal2 implements Serializable {
  { this.name = "Lisa"; }
  public Whale2() {
    this.name = "Roger";
  }
  @Override
  public String toString() {
    return this.name;
  }
  public static void main(String ... args) {
  }
}
