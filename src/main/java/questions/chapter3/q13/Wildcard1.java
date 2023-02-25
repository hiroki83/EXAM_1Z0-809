package questions.chapter3.q13;

import java.util.Collection;
import java.util.List;
import java.util.ArrayDeque;

public class Wildcard1 {
  //public void showSize(List<?> list) {
  //  System.out.println(list.size());
  public void showSize(Collection<?> collection) {
    System.out.println(collection.size());
  }
  public static void main(String[] args) {
    Wildcard1 card = new Wildcard1();
    ArrayDeque<?> list = new ArrayDeque<String>();
    card.showSize(list);
  }
}
