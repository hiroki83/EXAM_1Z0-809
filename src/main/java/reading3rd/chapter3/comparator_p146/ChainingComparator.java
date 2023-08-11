package reading3rd.chapter3.comparator_p146;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ChainingComparator implements Comparator<Squirrel> {
  public int compare(Squirrel s1, Squirrel s2) {
    Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
    c = c.thenComparingInt(s -> s.getWeight());
    return c.compare(s1, s2);
  }
  public static void main(String ... args) {
    List<Squirrel> squirrels = new ArrayList<>();
    squirrels.add(new Squirrel("oriental", 60));
    squirrels.add(new Squirrel("occidental", 50));
    squirrels.add(new Squirrel("occidental", 10));
    squirrels.add(new Squirrel("oriental", 20));
    squirrels.add(new Squirrel("occidental", 30));
    squirrels.add(new Squirrel("oriental", 40));
    Collections.sort(squirrels, new MultiFieldComparator());
    System.out.println(squirrels);
  }
}
