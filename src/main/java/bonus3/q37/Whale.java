package bonus3.q37;

import java.io.Serializable;

public class Whale extends Mammal implements Serializable {
  { this.name = "Lisa"; }
  public Whale() {
    this.name = "Roger";
  }
  @Override
  public String toString() {
    return this.name;
  }
  public static void main(String ... args) {
  }
}
