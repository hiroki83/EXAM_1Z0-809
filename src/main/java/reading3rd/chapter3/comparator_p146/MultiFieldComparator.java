package reading3rd.chapter3.comparator_p146;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MultiFieldComparator implements Comparator<Squirrel> {
  @Override
  public int compare(Squirrel s1, Squirrel s2) {
    int result = s1.getSpecies().compareTo(s2.getSpecies());
    if (result != 0) return result;
    return s1.getWeight()-s2.getWeight();
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
