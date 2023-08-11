package reading3rd.chapter3.interactinglegacycode_p115;

import java.util.List;
import java.util.ArrayList;

public class Autoboxing {
  public static void main(String ... args) {
    List<Integer> numbers = new ArrayList();
    numbers.add(5);
    int result = numbers.get(0);
    System.out.println(result);
  }
}
