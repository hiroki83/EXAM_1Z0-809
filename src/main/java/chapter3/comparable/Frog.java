package chapter3.comparable;

import java.util.*;

public class Frog implements Comparable<Duck> {
  private String name;
  public Frog(String name) {
    this.name = name;
  }
  public String toString() {
    return name;
  }
  public int compareTo(Duck d) {
    //return name.compareTo(d.name);
    return 1;
  }
  public static void main(String[] args) {
//    List<Duck> ducks = new ArrayList<>();
//    ducks.add(new Duck("Quack"));
//    ducks.add(new Duck("Puddles"));
//    Collections.sort(ducks);
//    System.out.println(ducks);
  }
}
