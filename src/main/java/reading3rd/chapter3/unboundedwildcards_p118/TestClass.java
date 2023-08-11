package reading3rd.chapter3.unboundedwildcards_p118;

import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void printList(List<Object> list) {
    for(Object x : list) System.out.println(x);
  }
  public static void main(String ... args) {
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
    //printList(keywords); // DOES NOT COMPILE


    List<Integer> numbers = new ArrayList<>();
    numbers.add(new Integer(42));
    //List<Object> objects = numbers; // DOES NOT COMPILE
    //objects.add("forty two");
    System.out.println(numbers.get(0));

    Object[] o = new String[0];
    Integer[] numbers1 = {new Integer(42)};
    Object[] objects1 = numbers1;
    objects1[0] = "forty two";
  }
}
