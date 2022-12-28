package chapter4.implementing_supplier;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.time.LocalDate;;

public class TestClass {
  public static void main(String[] args) {
    Supplier<LocalDate> s1 = LocalDate::now;
    Supplier<LocalDate> s2 = () -> LocalDate.now();

    LocalDate d1 = s1.get();
    LocalDate d2 = s2.get();

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(LocalDate.now());

    Supplier<StringBuilder> sb1 = StringBuilder::new;
    Supplier<StringBuilder> sb2 = () -> new StringBuilder();

    System.out.println(sb1.get());
    System.out.println(sb2.get());

    Supplier<ArrayList<String>> l1 = ArrayList<String>::new;
    ArrayList<String> p = l1.get();
    System.out.println(l1);
  }
}
