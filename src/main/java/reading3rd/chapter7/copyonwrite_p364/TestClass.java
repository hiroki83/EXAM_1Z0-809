package reading3rd.chapter7.copyonwrite_p364;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestClass {
  public static void main(String ... args) {
    List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
    for (Integer item: list) {
      System.out.print(item+" ");
      list.add(9);
    }
    System.out.println();
    System.out.println("Size: "+list.size());
  }
}
