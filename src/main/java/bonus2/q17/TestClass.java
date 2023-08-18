package bonus2.q17;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
  public static void main(String ... args) {
    String rootPath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q17";
    Path userDirectory = Paths.get(rootPath, "coralreef/../clown/fish").normalize(); // m1
    //Path userDirectory = Paths.get("/Users").normalize(); // m1
    //Path pantherDirectory = userDirectory.getRoot().getParent().resolve("dolphin"); // m2 DOES NOT COMPILE
    Path pantherDirectory = userDirectory.getParent().resolve("dolphin"); // m2
    System.out.println(pantherDirectory.toAbsolutePath()); // m3
  }
}
