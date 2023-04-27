package questions.chapter8.q18;

import java.io.Console;

public class TestClassE {
  public static void main(String ... args) {
    Console console = System.console();
    String color = console.readLine("What is your favorite color? ");
    console.writer().println("Your favorite color is "+color);
  }
}
