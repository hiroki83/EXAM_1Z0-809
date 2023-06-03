package bonus1.q7;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringSearch {
  public static void main(String ... args) {
    List<String> list = new ArrayList<String>();
    list.add("ab");
    list.add("ba");
    list.add("bd");
    list.add("aa");

    Comparator<String> comparator = (a, b) -> b.compareToIgnoreCase(a);
    Collections.sort(list, comparator);
    int index = Collections.binarySearch(list, "ab", comparator);
    System.out.println(index);
  }
}
