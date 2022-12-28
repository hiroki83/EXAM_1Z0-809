package chapter5.resource_bundle;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.Locale;

public class Tax_en_US extends ListResourceBundle {
  protected Object[][] getContents() {
    return new Object[][] {
      {
        "tax", new UsTaxCode()
      }
    };
  }
  public static void main(String[] args) {
    ResourceBundle rb = ResourceBundle.getBundle(
    "chapter5.resource_bundle.Tax", Locale.US);
    System.out.println(rb.getObject("tax"));
  }
}
