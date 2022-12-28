package chapter4.stream_pipeline;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestClass {
  public static void main(String[] args) {
    //version java7
    List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
    List<String> filtered = new ArrayList<>();
    for (String name : list) {
      if (name.length() == 4) filtered.add(name);
    }
    Collections.sort(filtered);
    Iterator<String> iter = filtered.iterator();
    if(iter.hasNext()) System.out.println(iter.next());
    if(iter.hasNext()) System.out.println(iter.next());

    //version after java8
    list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
  }
}
