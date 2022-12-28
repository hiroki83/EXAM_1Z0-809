package chapter3.comparator;

import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    //Comparator<Duck> byWeight = new Comparator<Duck>() {
    //  public int compare(Duck d1, Duck d2) {
    //    return d1.getWeight()-d2.getWeight();
    //  }
    //};
    Comparator<Duck> byWeight = (Duck d1, Duck d2) -> { return d1.getWeight()-d2.getWeight(); };
    List<Duck> ducks = new ArrayList<>();
    ducks.add(new Duck("Quack", 7));
    ducks.add(new Duck("Puddles", 10));
    Collections.sort(ducks);
    System.out.println(ducks);
    Collections.sort(ducks, byWeight);
    System.out.println(ducks);
  }
}
