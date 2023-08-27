package bonus3.q60;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    String rootPath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus3/q60/";
    Path path1 = Paths.get(rootPath, "lemur/habitat/./party.txt");
    Path path2 = path1.subpath(10,13).toAbsolutePath();
    System.out.println(Files.lines(path2)
      .peek(System.out::println)
      .flatMap(p -> Stream.of(p.split(",")))
      .peek(System.out::println)
      .filter(s -> s.trim().length() > 0)
      .allMatch(s -> s.length() > 3));
  }
}
