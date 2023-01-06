package chapter8.streams.interacting_with_users;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SystemInSampleWithOldWay {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String userInput = reader.readLine();
    System.out.println("You entered the following: "+userInput);
  }
}
