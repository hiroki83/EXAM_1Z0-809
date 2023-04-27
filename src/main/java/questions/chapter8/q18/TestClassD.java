package questions.chapter8.q18;

import java.io.Console;

public class TestClassD {
  public static void main(String ... args) {
    Console console = System.console();
    String color = console.readLine("What is your favorite color? ");
    console.format("Your favorite color is "+color);
  }
}
