package reading3rd.chapter3.methodreferences_p152;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestClass {
  public static void main(String ... args) {
    Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
    Comparator<Duck> byName = DuckHelper::compareByName;

    List<Duck> ducks = new ArrayList<>();
    ducks.add(new Duck("test1",10));
    ducks.add(new Duck("test3",30));
    ducks.add(new Duck("test2",20));
    Collections.sort(ducks, byName);
    System.out.println(ducks);
  }
}
