package reading3rd.chapter3.arrayarraylist_p104;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    List<String> list = new ArrayList<>();
    list.add("Fluffy");
    list.add("Webby");

    String[] array = new String[list.size()];
    array[0] = list.get(1);
    array[1] = list.get(0);

    for(int i = 0; i < array.length; i++)
      System.out.print(array[i] + "-");

    System.out.println();
    String[] array1 = {"gerbil", "mouse"};
    List<String> list1 = Arrays.asList(array1);
    System.out.println("list1="+list1);
    list1.set(1, "test");
    array1[0] = "new";
    String[] array2 = (String[]) list1.toArray();
    System.out.println("list1="+list1);
    System.out.println("array1="+Arrays.toString(array1));
    System.out.println("array2="+Arrays.toString(array2));
    list1.remove(1);
  }
}
