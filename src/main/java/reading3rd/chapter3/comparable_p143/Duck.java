package reading3rd.chapter3.comparable_p143;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Duck implements Comparable<Duck> {
  private String name;
  public Duck(String name) {
    this.name = name;
  }
  public String toString() {
    return name;
  }
  @Override
  public int compareTo(Duck d) {
    return name.compareTo(d.name);
  }
  public static void main(String ... args) {
    List<Duck> ducks = new ArrayList<>();
    ducks.add(new Duck("Quack"));
    ducks.add(new Duck("Puddles"));
    Collections.sort(ducks);
    System.out.println(ducks);
  }
}
