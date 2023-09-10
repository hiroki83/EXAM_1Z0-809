package reading3rd.chapter5.formattingnumbers_p267;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {
  public static void main(String ... args) {
    int attendeesPerYear = 3_200_000;
    int attendeesPerMonth = attendeesPerYear / 12;
    double price = 48;
    double fraction = 0.48;
    NumberFormat us = NumberFormat.getInstance(Locale.US);
    NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat usPercent = NumberFormat.getPercentInstance(Locale.GERMANY);
    System.out.println(us);
    System.out.println(us.format(attendeesPerMonth));
    System.out.println(us.format(price));
    System.out.println(usCurrency.format(price));
    System.out.println(usPercent.format(fraction));
    NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
    NumberFormat gCurrency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    NumberFormat gPercent = NumberFormat.getPercentInstance(Locale.GERMANY);
    System.out.println(g);
    System.out.println(g.format(attendeesPerMonth));
    System.out.println(g.format(price));
    System.out.println(gCurrency.format(price));
    System.out.println(gPercent.format(fraction));
    NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
    NumberFormat caCurrency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
    NumberFormat caPercent = NumberFormat.getPercentInstance(Locale.CANADA_FRENCH);
    System.out.println(ca);
    System.out.println(ca.format(attendeesPerMonth));
    System.out.println(ca.format(price));
    System.out.println(caCurrency.format(price));
    System.out.println(caPercent.format(fraction));

    System.out.println();
    
    try {
      NumberFormat en = NumberFormat.getInstance(Locale.US);
      NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
      NumberFormat nf = NumberFormat.getInstance();
      String s = "40.456";
      System.out.println(en.parse(s));
      System.out.println(fr.parse(s));

      String one = "456abc";
      String two = "-2.5165x10";
      String three = "x85.3";


      System.out.println(nf.parse(one));
      System.out.println(nf.parse(two));
      System.out.println(nf.parse(three));
    } catch (ParseException e) {
      e.printStackTrace();
    }

    System.out.println();
    String amtWithCurrencyMark = "$92,807.99";
    String amtWithoutCurrencyMark = "92,807.99";
    NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
    try {
      double value1 = (Double) cf.parse(amtWithCurrencyMark);
      System.out.println(value1);
      double value2 = (Double) cf.parse(amtWithoutCurrencyMark);
      System.out.println(value2);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
