package chapter8.streams.interacting_with_users;

import java.io.IOException;
import java.io.Console;
import java.util.Arrays;

public class PasswordCompareSample {
  public static void main(String[] args) throws IOException {
    Console console = System.console();
    if(console == null) {
      throw new RuntimeException("Console not available");
    } else {
      char[] password = console.readPassword("Enter your password: ");
      console.format("Enter your password again: ");
      console.flush();
      char[] verify = console.readPassword();
      boolean match = Arrays.equals(password, verify);

      // Immediately clear passwords from memory
      for(int i=0; i<password.length; i++) {
        password[i]='x';
      }
      for(int i=0; i<verify.length; i++) {
        verify[i]='x';
      }
      console.format("Your password was "+(match ? "correct": "incorrect"));
    }
  }
}
