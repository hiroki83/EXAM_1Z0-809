package bonus2.q30;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClass {
  public static void main(String ... args) {
    try (FileReader fileReader = new FileReader("src/main/resources/bonus2/q30/zoo.csv");
         BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      while(bufferedReader.readLine() != null) {
        System.out.println(bufferedReader.readLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
