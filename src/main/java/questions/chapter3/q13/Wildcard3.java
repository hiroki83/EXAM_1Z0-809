package questions.chapter3.q13;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Date;

public class Wildcard3 {
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  public static void main(String[] args) {
    Wildcard3 card = new Wildcard3();
    //List<?> list = new ArrayList<?>();//COMPILE ERROR
    List<?> list = new ArrayList<>();
    card.showSize(list);
  }
}
