package questions.chapter3.q17;

public class Generic3<T> {
  public static void main(String[] args) {
    //Generic3<String> g1 = new Generic3<?>();// COMPILE ERROR
    Generic3<Object> g2 = new Generic3();
  }
}
