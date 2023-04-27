package questions.chapter8.q18;

import java.io.Console;

public class TestClassF {
  public static void main(String ... args) {
    Console console = System.console();
    String color = console.readLine("What is your favorite color? ");
    //console.out("Your favorite color is "+color);// NOT COMPILE
  }
}
