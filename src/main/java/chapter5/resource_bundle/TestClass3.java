package chapter5.resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestClass3 {
  public static void main(String[] args) {
    System.out.println(Locale.getDefault());
    Locale localeFr = new Locale("fr", "FR");
    ResourceBundle rbFr = ResourceBundle.getBundle("Animal", localeFr);
    //Locale localeDe = new Locale("de");
    //ResourceBundle rbDe = ResourceBundle.getBundle("Animal", localeDe);
    System.out.println(rbFr.getString("open_Animal_fr_FR.properties"));
    System.out.println(rbFr.getString("open_Animal_fr.properties"));
    System.out.println(rbFr.getString("open_Animal_en_IT.properties"));
    //System.out.println(rbDe.getString("open_Animal_en_IT.properties"));
    System.out.println(rbFr.getString("open_Animal_en.properties"));
    System.out.println(rbFr.getString("open_Animal.properties"));
  }
}
