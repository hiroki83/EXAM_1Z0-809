package chapter8.streams.object;

import java.io.Serializable;

public class AnimalWithTransient implements Serializable {
  private static final long serialVersionUID = 2L;

  private transient String name;
  private transient int age;
  private static char type;

  {this.age = 14;}

  public AnimalWithTransient() {
    this.name = "Unknown";
    this.age = 12;
    this.type = 'Q';
  }

  public AnimalWithTransient(String name, int age, char type) {
    this.name = name;
    this.age = age;
    this.type = type;
  }
  public String getName() {return name;}
  public int getAge() {return age;}
  public char getType() {return type;}

  public String toString() {
    return "Animal [name="+name+", age="+age+", type="+type+"]";
  }
}
