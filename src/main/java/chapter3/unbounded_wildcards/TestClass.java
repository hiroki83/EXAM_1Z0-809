package chapter3.unbounded_wildcards;

import java.util.*;

public class TestClass {
public static void main (String[] args) {
  List<String> keywords = new ArrayList<>();
  keywords.add("java");
  printList(keywords);
}

public static void printList(List<?> list) {
  for (Object x: list) System.out.println(x);
}
}
