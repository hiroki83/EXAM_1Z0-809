package reading3rd.questions.chapter3.q13;

import java.util.*;

public class WildcardA {
  //public void showSize(List<?> list) {
  public void showSize(Queue<?> list) {
    System.out.println(list.size());
  }
  public static void main(String ... args) {
    WildcardA card = new WildcardA();
    ArrayDeque<?> list = new ArrayDeque<String>();
    card.showSize(list);
  }
}
