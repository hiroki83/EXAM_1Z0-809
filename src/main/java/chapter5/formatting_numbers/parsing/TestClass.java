package chapter5.formatting_numbers.parsing;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TestClass {
  public static void main(String[] args) throws ParseException {

    String amt = "$92,807.99";
    NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
    double value = (Double) cf.parse(amt);
    System.out.println(value);

    NumberFormat en = NumberFormat.getInstance(Locale.US);
    NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
    NumberFormat it = NumberFormat.getInstance(Locale.ITALY);
    NumberFormat jp = NumberFormat.getInstance(Locale.JAPAN);

    String s1 = "2,540.45";
    System.out.println("[2,540.45]");
    System.out.println(en.parse(s1));
    System.out.println(fr.parse(s1));
    System.out.println(it.parse(s1));
    System.out.println(jp.parse(s1));

    String s2 = "2.540,45";
    System.out.println("[2.540,45]");
    System.out.println(en.parse(s2));
    System.out.println(fr.parse(s2));
    System.out.println(it.parse(s2));
    System.out.println(jp.parse(s2));

    String s3 = "2540,45";
    System.out.println("[2540,45]");
    System.out.println("2.540.45");
    System.out.println(en.parse(s3));
    System.out.println(fr.parse(s3));
    System.out.println(it.parse(s3));
    System.out.println(jp.parse(s3));

    NumberFormat nf = NumberFormat.getInstance();
    String one = "456abc";
    String two = "-2.5165x10";
    String three = "x85.3";
    System.out.println(nf.parse(one));
    System.out.println(nf.parse(two));
    System.out.println(nf.parse(three));
  }
}
