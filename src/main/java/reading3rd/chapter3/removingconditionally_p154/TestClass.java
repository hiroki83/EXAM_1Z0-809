package reading3rd.chapter3.removingconditionally_p154;

import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String ... args) {
    List<String> list = new ArrayList<>();
    list.add("Magician");
    list.add("Assistant");
    System.out.println(list);
    //list.removeIf(String::startsWith("A"));
    list.removeIf(s -> s.startsWith("A"));
    System.out.println(list);
  }
}
