//https://howtodoinjava.com/java/collections/java-copyonwritearraylist/#1-copyonwritearraylist-hierarchy
package reading3rd.chapter7.copyonwrite_p364;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestClass2 {
  public static void main(String ... args) {
    List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
    System.out.println(list);

    //Get iterator 1
    Iterator<Integer> itr1 = list.iterator();

    //Add one element and verify list is updated
    list.add(9);

    System.out.println(list); //[4, 3, 52, 9]

    //Get iterator 2
    Iterator<Integer> itr2 = list.iterator();

    System.out.println("=====Verify Iterator 1 content=====:");
    itr1.forEachRemaining(System.out :: println); //4,3,52
    System.out.println("=====Verify Iterator 2 content=====:");
    itr2.forEachRemaining(System.out :: println); //4,3,52,9
  }
}
