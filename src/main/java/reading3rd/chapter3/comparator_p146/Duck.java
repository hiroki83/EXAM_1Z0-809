package reading3rd.chapter3.comparator_p146;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Duck implements Comparable<Duck> {
  private String name;
  private int weight;
  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  @Override
  public String toString() {
    return name;
  }
  public String getName() { return this.name;}
  public int getWeight() { return this.weight;}
  @Override
  public int compareTo(Duck d) {
    return name.compareTo(d.name);
  }
  public static void main(String ... args) {
    //Comparator<Duck> byWeight = new Comparator<Duck>() {
    //  public int compare(Duck d1, Duck d2) {
    //    return d1.getWeight()-d2.getWeight();
    //  }
    //};
    Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();
    List<Duck> ducks = new ArrayList<>();
    ducks.add(new Duck("Quack", 50));
    ducks.add(new Duck("Puddles", 60));
    Collections.sort(ducks);
    System.out.println(ducks);
    Collections.sort(ducks, byWeight);
    System.out.println(ducks);
  }
}
