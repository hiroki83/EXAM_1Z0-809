package bonus2.q44;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.io.IOException;

public class TestClass2 {
  public static void main(String ... args) throws IOException {
    Path path = Paths.get("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q44/storage", "toys").resolve("bird"); // n1
    //Files.find(path, (p, a) -> a.isDirectory()) // n2 DOES NOT COMPILE
    Files.find(path, 3, (p, a) -> a.isDirectory()) // n2
      .map(p -> {
        try {
          return p.toRealPath(LinkOption.NOFOLLOW_LINKS).toString(); // n3
        } catch (IOException e) {
          e.printStackTrace();
          throw new RuntimeException(e);
        }
      })
      //.map(p -> p.normalize()) // n4 DOES NOT COMPILE
      .forEach(System.out::println);
  }
}
