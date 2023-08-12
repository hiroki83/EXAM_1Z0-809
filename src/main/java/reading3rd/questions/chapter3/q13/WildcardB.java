package reading3rd.questions.chapter3.q13;

import java.util.*;

public class WildcardB {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String ... args) {
    WildcardB card = new WildcardB();
    ArrayList<? super Date> list = new ArrayList<Date>();
    card.showSize(list);
  }
}
