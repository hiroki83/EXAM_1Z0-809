package reading3rd.chapter5.wronglocalecreating_p257;

import java.util.Locale;

public class TestClass {
  public static void main(String ... args) {
    Locale locale = new Locale("test", "test");
    System.out.println(Locale.getDefault());
    Locale.setDefault(locale);
    System.out.println(Locale.getDefault());
  }
}
