package chapter1.nested.anonymousinner;

public class AnonInner2 {
  interface SaleTodayOnly2 {
    int dollarsOff();
  }
  public int admission(int basePrice) {
    SaleTodayOnly2 sale = new SaleTodayOnly2() {
      public int dollarsOff() { return 5;}
    };
    return basePrice - sale.dollarsOff();
  }

  public static void main(String[] args) {
    AnonInner2 a = new AnonInner2();
    System.out.println(a.admission(1000));
  }
}
