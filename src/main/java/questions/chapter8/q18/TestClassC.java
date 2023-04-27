package questions.chapter8.q18;

import java.io.Console;

public class TestClassC {
  public static void main(String ... args) {
    Console console = System.console();
    String color = console.readLine("What is your favorite color? ");
    //console.println("Your favorite color is "+color);// NOT COMPILE
  }
}
