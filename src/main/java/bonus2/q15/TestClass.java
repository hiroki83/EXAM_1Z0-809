package bonus2.q15;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;

public class TestClass {
  public static void main(String ... args) {
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
    List<Integer> list2 = new CopyOnWriteArrayList<>(list1);
    List<Integer> list3 = Collections.synchronizedList(list1);

    for(Integer item : list2) list2.add(10); //h1
    for(Integer item : list3) list3.remove(0); //h2
    System.out.println(list1.size() + " "+list2.size()+" "+list3.size());
  }
}
