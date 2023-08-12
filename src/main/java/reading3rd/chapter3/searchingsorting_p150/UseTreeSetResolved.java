package reading3rd.chapter3.searchingsorting_p150;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class UseTreeSetResolved {
  static class Rabbit { int id; }
  public static void main(String ... args) {
    Set<Rabbit> rabbit1 = new TreeSet<>(
      new Comparator<Rabbit>() {
        public int compare(Rabbit r1, Rabbit r2) {
          return r1.id - r2.id;
        }
      }
    );
    rabbit1.add(new Rabbit());

    Set<Rabbit> rabbit2 = new TreeSet<>();
    rabbit2.add(new Rabbit()); // throws an exception
  }
}
