package chapter3.comparator;

public class Duck implements Comparable<Duck> {
  private String name;
  private int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() { return name;}
  public int getWeight() { return weight;}
  public String toString() { return name;}
  public int compareTo(Duck d) {
    return name.compareTo(d.name);
  }
}
