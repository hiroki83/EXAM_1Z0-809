package reading3rd.questions.chapter3.q11;

import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String ... args) {
    Map<Integer, Integer> map = new HashMap<>(10);
    System.out.println(map.size());
    for(int i = 1; i <= 11; i++)
      map.put(i, i *i);
    System.out.println(map.get(4));
  }
}
