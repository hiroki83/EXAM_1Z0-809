package chapter8.streams.object;

import java.io.Serializable;

public class AnimalWithoutGetters implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private int age;
  private char type;

  public AnimalWithoutGetters(String name, int age, char type) {
    this.name = name;
    this.age = age;
    this.type = type;
  }

  public String toString() {
    return "Animal [name="+name+", age="+age+", type="+type+"]";
  }
}
