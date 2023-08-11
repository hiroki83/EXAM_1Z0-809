package reading3rd.chapter3.listmethods_p130;

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Stack;

public class TestClass {
  public static void main(String ... args) {
    List<String> list = new ArrayList<>();
    list.set(1,"");
    System.out.println(list);

    List<String> list1 = new ArrayList<>();
    list1.add("SD");
    list1.add(0, "NY");
    list1.set(1, "FL");
    list1.remove("NY");
    list1.remove(0);

    List<String> list2 = new ArrayList<>();
    list2.add("NJ");
    String state1 = list2.get(0);
    int index1 = list2.indexOf("NJ");

    List<String> list3 = new LinkedList<>();
    list3.add("NJ");
    String state2 = list3.get(0);
    int index2 = list3.indexOf("NJ");

    List<String> vector = new Vector<>();
    vector.add("NJ");
    String state3 = vector.get(0);
    int index3 = vector.indexOf("NJ");

    List<String> stack = new Stack<>();
    stack.add("NJ");
    String state4 = stack.get(0);
    int index4 = stack.indexOf("NJ");
  }
}
