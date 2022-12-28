package chapter5.resource_bundle;

import java.util.Set;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;

public class TestClass {
  public static void main(String[] args) {
    Locale us = new Locale("en", "US");
    Locale france = new Locale("fr", "FR");
    printProperties(us);
    System.out.println();
    printProperties(france);
  }
  private static void printProperties(Locale locale) {
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));

    Set<String> keys = rb.keySet();
    keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
    Properties props = new Properties();
    rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
    System.out.println(props.getProperty("notReallyAPrpoperty"));
    System.out.println(props.getProperty("notReallyAPrpoperty", "123"));
  }
}
