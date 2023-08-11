package reading3rd.chapter3.upperboundedwildcards_p119;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    //ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
    List<? extends Number> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    //list1.add(10);// DOES NOT COMPILE
    System.out.println(total(list1));   
    List<? extends Number> list2 = new ArrayList<Long>(Arrays.asList(1L,2L,3L,4L,5L,6L));
    System.out.println(total(list2));   
    List<? extends Number> list3 = new ArrayList<Number>(Arrays.asList(1,2,3,4,5,6,7));
    System.out.println(total(list3));   
  }
  public static long total(List<? extends Number> list) {
    long count = 0;
    for (Number number : list)
      count += number.longValue();
    //list.add(1);// DOES NOT COMPILE
    return count;
  }
}
