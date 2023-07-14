package bonus1.q57;

import java.io.Console;

public class TestClass {
  public static void main(String ... args) {
    Console console = System.console();
    //String password = console.readPassword("Enter a password: ");// COMPILE ERROR
    char[] password = console.readPassword("Enter a password: ");
    System.out.println("You entered: " + password);
  }
}
