package chapter8.streams.interacting_with_users;

import java.io.IOException;
import java.io.Console;
import java.io.BufferedReader;

public class ConsoleReadInputSample {
  public static void main(String[] args) throws IOException {
    Console console = System.console();
    if(console == null) {
      throw new RuntimeException("Console not available");
    } else {
      console.writer().print("How excited are you about your trip today? ");
      console.flush();
      String excitementAnswer = console.readLine();
      String name = console.readLine("Please enter your name: ");
      Integer age = null;
      console.writer().print("What is your age?");
      console.flush();
      BufferedReader reader = new BufferedReader(console.reader());
      String value = reader.readLine();
      age = Integer.valueOf(value);
      console.format("Your name is "+name);
      console.writer().println();
      console.format("Your age is "+age);
      console.printf("Your excitement level is: "+excitementAnswer);
    }
  }
}
