package questions.chapter9.q6;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class TestClassWithFind {
  public static void main(String ... args) {
    Path path = Paths.get("src/main/resources/questions/chapter9/q6/animals");
    try {
      boolean myBoolean = Files.find(path,1,(p,a) -> a.isDirectory() && !path.equals(p))
        //.filter((p,a) -> a.isDirectory() && !path.equals(p)) // w1
        .findFirst().isPresent(); // w2
      System.out.println(myBoolean ? "No Sub-directory": "Has Sub-directory");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
