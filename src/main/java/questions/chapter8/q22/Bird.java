package questions.chapter8.q22;

import java.io.Serializable;

public class Bird implements Serializable {
  protected transient String name = "Bridget";
  public void setName(String name) { this.name = name; }
  public String getName() { return name; }
  public Bird() {
    this.name = "Matt";
  }
}
