package reading3rd.questions.chapter3.q13;

import java.util.*;

public class WildcardD {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String ... args) {
    WildcardD card = new WildcardD();
    //List<Exception> list = new LinkedList<java.io.IOException>();// DOES NOT COMPILE
    List<Exception> list = new LinkedList<>();
    card.showSize(list);
  }
}
