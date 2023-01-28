package chapter1.nested.anonymousinner;

public class AnonInnerArg {
  interface SaleTodayOnly {
    int dollarsOff();
  }
  public int pay() {
    return admission(100, new SaleTodayOnly() {
        public int dollarsOff() {return 50;}
      });
  }
  public int admission(int basePrice, SaleTodayOnly sale) {
    return basePrice - sale.dollarsOff();
  }

  public static void main(String[] args) {
    AnonInnerArg a = new AnonInnerArg();
    System.out.println(a.pay());
  }
}
