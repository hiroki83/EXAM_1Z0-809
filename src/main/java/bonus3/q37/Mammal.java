package bonus3.q37;

public class Mammal {
  protected transient String name = "Moby";
  public void setName(String name) { this.name = name; }
  public String getName() { return name; }
  public Mammal() {
    this.name = "Monstro";
  }
}
