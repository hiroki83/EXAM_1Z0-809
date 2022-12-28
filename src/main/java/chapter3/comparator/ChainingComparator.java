package chapter3.comparator;

import java.util.*;

public class ChainingComparator implements Comparator<Squirrel> {
  public int compare(Squirrel s1, Squirrel s2) {
    Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
    //Comparator<Squirrel> c = Comparator.thenComparing(s -> s.getSpecies());//DOES NOT COMPILE
    c = c.thenComparingInt(s -> s.getWeight());
    c = c.thenComparing(s -> s.getName());
    return c.compare(s1, s2);
  }
}
