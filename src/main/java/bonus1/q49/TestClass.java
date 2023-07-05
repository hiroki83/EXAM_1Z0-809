package bonus1.q49;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String ... args) {
    try {
      Path path = Paths.get("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus1/q49/giraffe/food.csv");
      Files.lines(path)
        .flatMap(p -> Stream.of(p.split(","))) // j1
        .map(s -> s.length()) // j2
        .collect(Collectors.toList())
        .forEach(System.out::print); // j3
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
