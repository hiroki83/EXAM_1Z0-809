package chapter5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Runner {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("chapter5.Zoo");
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("a"));
    }
}
