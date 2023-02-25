package questions.chapter3.q17;

public class Generic4<T> {
  public static <U extends String> void main(String[] args) {
    //Generic4<String> g1 = new Generic4<T>();// COMPILE ERROR non-static type variable T cannot be referenced from a static context
    Generic4<U> g1 = new Generic4<>();
    Generic4<Object> g2 = new Generic4();
    //Generic4<T> g3 = new Generic4();// COMPILE ERROR non-static type variable T cannot be referenced from a static context
  }
  public void methodA() {
    //Generic4<String> g4 = new Generic4<T>();// COMPILE ERROR incompatible types cannot be converted
    //Generic4<Object> g5 = new Generic4<T>();// COMPILE ERROR incompatible types cannot be converted
    Generic4<T> g5 = new Generic4<T>();
    Generic4<T> g6 = new Generic4<>();
  }
}
