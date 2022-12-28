package chapter5.locale;

import java.util.Locale;

public class TestClass {
  public static void main(String[] args) {
    Locale locale = Locale.getDefault();
    System.out.println(locale);

    Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
    Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
    System.out.println(l1);
    System.out.println(l2);
  }
}
