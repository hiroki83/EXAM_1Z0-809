package bonus2.q37;

import java.util.Set;
import java.util.HashSet;

public class Panda {
  String name;
  Panda(String name) { this.name = name; }

  public static void main(String ... args) {
    Set s = new HashSet<>();
    s.add(new Panda("Bao Bao"));
    s.add(new Panda("Mei Xiang"));
    s.add(new Panda("Bao Bao"));
    System.out.println(s.size());
  }
  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
  @Override
  public boolean equals(Object o) {
    if (o instanceof Panda) {
      Panda panda = (Panda) o;
      return this.name.equals(panda.name);
    }
    return false;
  }
}
