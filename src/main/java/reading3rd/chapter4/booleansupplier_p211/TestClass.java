package reading3rd.chapter4.booleansupplier_p211;

import java.util.function.BooleanSupplier;

public class TestClass {
  public static void main(String ... args) {
    BooleanSupplier b1 = () -> true;
    BooleanSupplier b2 = () -> Math.random() > .5;
    System.out.println(b1.getAsBoolean());
    System.out.println(b2.getAsBoolean());
  }
}
