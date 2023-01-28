package chapter1.nested.anonymousinner;

public class AnonInner3 {
  abstract class SaleTodayOnly3 {
    //abstract int dollarsOff();
    int print() {
      System.out.println("concreate method");
      return 10;
    }
  }
  public int admission(int basePrice) {
    SaleTodayOnly3 sale = new SaleTodayOnly3() {
    };
    return basePrice - sale.print();
  }

  public static void main(String[] args) {
    AnonInner3 a = new AnonInner3();
    System.out.println(a.admission(1000));
  }
}
