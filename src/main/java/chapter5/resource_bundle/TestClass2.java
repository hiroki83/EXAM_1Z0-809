package chapter5.resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;

public class TestClass2 {
  public static void main(String[] args) {
    Locale locale = new Locale("en", "CA");
    ResourceBundle rb = ResourceBundle.getBundle("chapter5.resource_bundle.Zoo", locale);
    String format = rb.getString("helloByName");
    String formatted = MessageFormat.format(format, "Tammy");
    //System.out.print(rb.getString("hello"));
    System.out.print(formatted);
    System.out.print(". ");
    System.out.print(rb.getString("name"));
    System.out.print(" ");
    System.out.print(rb.getString("open"));
    System.out.print(" ");
    System.out.println(rb.getString("visitor"));
  }
}
