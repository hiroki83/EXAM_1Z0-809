package questions.chapter3.q17;

public class Generic2<T> {
  public static void main(String[] args) {
    //Generic2<String> g1 = new Generic2<T>();// COMPILE ERROR non-static type variable T cannot be referenced from a static context
    Generic2<Object> g2 = new Generic2();
  }
}
