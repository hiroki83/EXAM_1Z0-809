package chapter5.formatting_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class TestClass {
  public static void main(String[] args) {
    int attendeesPerYear = 3_200_000;
    int attendeesPerMonth = attendeesPerYear / 12;
    NumberFormat us = NumberFormat.getInstance(Locale.US);
    System.out.println(us.format(attendeesPerMonth));
    NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
    System.out.println(g.format(attendeesPerMonth));
    NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
    System.out.println(ca.format(attendeesPerMonth));

    double price = 48;
    NumberFormat us_currency = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println(us_currency.format(price));
    NumberFormat g_currency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    System.out.println(g_currency.format(price));
    NumberFormat ca_currency = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println(ca_currency.format(price));
  }
}
