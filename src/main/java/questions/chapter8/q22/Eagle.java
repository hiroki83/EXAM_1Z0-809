package questions.chapter8.q22;

import java.io.Serializable;

public class Eagle extends Bird implements Serializable {
  { this.name = "Janette"; }
  public Eagle() {
    this.name = "Daniel";
  }
}
