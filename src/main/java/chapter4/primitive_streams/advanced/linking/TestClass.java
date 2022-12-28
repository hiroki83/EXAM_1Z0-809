package chapter4.primitive_streams.advanced.linking;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String[] args) {
    List<String> cats = new ArrayList<>();
    cats.add("Annie");
    cats.add("Ripley");
    Stream<String> stream = cats.stream();
    cats.add("KC");
    System.out.println(stream.count());
  }
}
