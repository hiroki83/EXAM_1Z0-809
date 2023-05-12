package questions.chapter9.q8;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
  public static void main(String ... args) {
    Path path1 = Paths.get("/pets/../cat.txt");
    Path path2 = Paths.get("./dog.txt");
    System.out.println(path1.resolve(path2));
    System.out.println(path2.resolve(path1));
  }
}
