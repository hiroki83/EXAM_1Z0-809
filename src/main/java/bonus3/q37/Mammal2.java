package bonus3.q37;

import java.io.Serializable;

public class Mammal2 {
//public class Mammal2 implements Serializable {
  protected transient String name = "Moby";
  public void setName(String name) { this.name = name; }
  public String getName() { return name; }
  public Mammal2() {
    //this.name = "Monstro";
  }
}
