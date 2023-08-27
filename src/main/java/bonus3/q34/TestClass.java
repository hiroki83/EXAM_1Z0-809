package bonus3.q34;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestClass {
  public static void main(String ... args) {
    //Locale.setDefault(Locale.get("en", "US")); // DOES NOT COMPILE
    Locale.setDefault(new Locale("en", "US"));
    //ResourceBundle b = new ResourceBundle("Dolphins"); // DOES NOT COMPILE
    ResourceBundle b = ResourceBundle.getBundle("Dolphins");
   b.getString("name");
  }
}
