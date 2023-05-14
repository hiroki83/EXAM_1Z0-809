package questions.chapter9.q6;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class TestClassWithFindFile {
  public static void main(String ... args) {
    Path path = Paths.get("src/main/resources/questions/chapter9/q6/animals-subdirectory");
    System.out.println(Files.exists(path));
    try {
      boolean myBoolean = Files.find(path,10,(p,a) -> a.isDirectory() && !path.equals(p))
        .findFirst().isPresent(); // w2
      Stream<Path> stream = Files.find(path, 10, (p,a) -> a.isDirectory() && !path.equals(p));
      stream.forEach(System.out::println);
      System.out.println(myBoolean ? "No Sub-directory": "Has Sub-directory");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
