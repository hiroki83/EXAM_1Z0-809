package reading3rd.chapter3.searchingsorting_p150;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class TestClass {
  public static void main(String ... args) {
    List<String> names = Arrays.asList("Fluffy", "Hoppy");
    //Comparator<String> c = Comparator.reverseOrder();
    Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
    int index = Collections.binarySearch(names, "Hoppy", c);
    System.out.println(index);
  }
}
