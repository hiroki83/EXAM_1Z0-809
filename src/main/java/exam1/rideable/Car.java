package exam1.rideable;

public class Car {
  private String name;
  public Car(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return this.name;
  }
}
