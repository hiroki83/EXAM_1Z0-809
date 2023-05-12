package questions.chapter9.q2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class TestClassE {
  public static void main(String ... args) {
    Path path = Paths.get("fakepath");
    if(Files.isDirectory(path)) {
      try {
        System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
}
