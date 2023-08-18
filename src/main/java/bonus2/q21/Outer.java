package bonus2.q21;

public class Outer {
  public static void main(String ... args) {
    class InnerA {
      public void print() {
        System.out.println("InnerA Roar!");
      }
    }
    for (int i = 0; i < 3; i++) {
      class InnerB {
        //public static void print() { // DOES NOT COMPILE
        public void print() {
          System.out.println("InnerB Roar!");
        }
      }
      new InnerA().print();
      new InnerB().print();
    }
    new InnerA().print();
    //new InnerB().print(); // DOES NOT COMPILE
  }
}
