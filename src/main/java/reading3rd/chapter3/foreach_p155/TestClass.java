package reading3rd.chapter3.foreach_p155;

import java.util.List;
import java.util.Arrays;

public class TestClass {
  public static void main(String ... args) {
    List<String> cats = Arrays.asList("Annie", "Ripley");
    for (String cat : cats) 
      System.out.println(cat);

    cats.forEach(c -> System.out.println(c));
    cats.forEach(System.out::println);
  }
}
