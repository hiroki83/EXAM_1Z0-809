package reading3rd.questions.chapter3.q19;

import java.util.Queue;
import java.util.LinkedList;

public class TestClassC {
  public static void main(String ... args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(12);
    q.remove(1);
    System.out.println(q);
  }
}
