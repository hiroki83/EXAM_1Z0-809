package reading3rd.questions.chapter3.q08;

import java.util.TreeSet;

public class TestClass {
  public static void main(String ... args) {
    TreeSet<String> tree = new TreeSet<String>();
    tree.add("one");
    tree.add("One");
    tree.add("ONE");
    System.out.println(tree.ceiling("On"));
  }
}
