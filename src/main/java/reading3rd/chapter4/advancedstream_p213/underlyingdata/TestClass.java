package reading3rd.chapter4.advancedstream_p213.underlyingdata;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    List<String> cats = new ArrayList<>();
    cats.add("Annie");
    cats.add("Ripley");
    Stream<String> stream = cats.stream();
    cats.add("KC");
    stream.forEach(System.out::println);
  }
}
