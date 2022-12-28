package chapter3.comparator;

import java.util.*;

public class Squirrel {
  private int weight;
  private String species;
  private String name;
  public Squirrel(String theSpecies, String name) {
    if (theSpecies == null) throw new IllegalArgumentException();
    species = theSpecies;
    this.name = name;
  }

  public int getWeight() { return weight; }
  public void setWeight(int weight) { this.weight = weight; }
  public String getSpecies() { return species;}
  public String getName() { return name;}
  public String toString() { return "specie:" +species + ", weight:" +weight + ", name:"+name; }

  public static void main(String[] args) {
    Squirrel s1 = new Squirrel("Italian", "Marco");
    s1.setWeight(20);
    Squirrel s2 = new Squirrel("Japan", "Hiroki");
    s2.setWeight(5);
    Squirrel s3 = new Squirrel("Japan", "Kyuzou");
    s3.setWeight(5);
    List<Squirrel> squirrels = new ArrayList<>();
    Squirrel s4 = new Squirrel("Japan", "Tizuru");
    s4.setWeight(2);
    squirrels.add(s4);
    squirrels.add(s3);
    squirrels.add(s2);
    squirrels.add(s1);
    System.out.println(squirrels);
    //Collections.sort(squirrels, new MultiFieldComparator());
    Collections.sort(squirrels, new ChainingComparator());
    System.out.println(squirrels);
  }
}
