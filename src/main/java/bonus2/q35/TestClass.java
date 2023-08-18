package bonus2.q35;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class TestClass {
  public static void main(String ... args) throws IOException {
    String filePath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q35/patrons.txt";
    File file = new File(filePath);
    Path path = file.toPath().normalize(); // j1
    //Path.lines(path).map(s -> "Hello " + s).forEach(System.out::println); // j2 DOES NOT COMPILE
    Files.lines(path).map(s -> "Hello " + s).forEach(System.out::println); // j2
  }
}
