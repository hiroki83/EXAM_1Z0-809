package questions.chapter9.q11;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) {
    Path path1 = Paths.get("./src/main/resources/questions/chapter9/q11/goat.txt").normalize();// k1
    Path path2 = Paths.get("src/main/resources/questions/chapter9/q11/mule.png");
    try {
      Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES); // k2
      System.out.println(Files.isSameFile(path1, path2)); //k3
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
