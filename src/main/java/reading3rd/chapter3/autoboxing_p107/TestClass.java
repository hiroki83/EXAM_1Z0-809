package reading3rd.chapter3.autoboxing_p107;

import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String ... args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(new Integer(3));
    numbers.add(new Integer(5));
    numbers.remove(1);
    numbers.remove(new Integer(5));
    System.out.println(numbers);
  }
}
