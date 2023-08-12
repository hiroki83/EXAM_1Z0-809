package reading3rd.chapter3.searchingsorting_p150;

import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortRabbits {
  static class Rabbit {
    int id;
    @Override
    public String toString() {
      return id + "";
    }
  }
  public static void main(String ... args) {
    List<Rabbit> rabbits = new ArrayList<>();
    rabbits.add(new Rabbit());
    rabbits.get(0).id = 1;
    Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
    Collections.sort(rabbits, c);
    System.out.println(rabbits);
  }
}
