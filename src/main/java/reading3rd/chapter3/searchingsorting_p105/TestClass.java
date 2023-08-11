package reading3rd.chapter3.searchingsorting_p105;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class TestClass {
  public static void main(String ... args) {
    int [] numbers = {6,9,1,8};
    Arrays.sort(numbers);
    System.out.println(Arrays.binarySearch(numbers, 6));
    System.out.println(Arrays.binarySearch(numbers, 3));

    List<Integer> list = Arrays.asList(9,7,5,3);
    Collections.sort(list);
    System.out.println(Collections.binarySearch(list, 3));
    System.out.println(Collections.binarySearch(list, 2));
  }
}
