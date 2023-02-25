package questions.chapter3.q13;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Date;

public class Wildcard2 {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String[] args) {
    Wildcard2 card = new Wildcard2();
    ArrayList<? super Date> list = new ArrayList<Date>();
    card.showSize(list);
  }
}
