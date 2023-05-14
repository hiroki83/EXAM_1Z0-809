package questions.chapter9.q17;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    Files.walk(Paths.get("src/main/resources/questions").toRealPath().getParent())  // u1
      .map(p -> p.toAbsolutePath().toString()) // u2
      .filter(s -> s.endsWith(".java")) // u3
      .collect(Collectors.toList())
      .forEach(System.out::println);
  }
}
