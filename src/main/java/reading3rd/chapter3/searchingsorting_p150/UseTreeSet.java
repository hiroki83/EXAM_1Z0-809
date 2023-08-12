package reading3rd.chapter3.searchingsorting_p150;

import java.util.Set;
import java.util.TreeSet;

class Duck implements Comparable<Duck> {
  private String name;
  public Duck(String name) {
    this.name = name;
  }
  @Override
  public int compareTo(Duck d) {
    return this.name.compareTo(d.name);
  }
}
public class UseTreeSet {
  static class Rabbit { int id; }
  public static void main(String ... args) {
    Set<Duck> ducks = new TreeSet<>();
    ducks.add(new Duck("Puddles"));
    Set<Rabbit> rabbit = new TreeSet<>();
    rabbit.add(new Rabbit()); // throws an exception
  }
}
