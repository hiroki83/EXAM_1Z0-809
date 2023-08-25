package bonus3.q07;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    //Path path = Paths.get("bear/polar/./environment").normalize().getRoot(); // w1
    Path path = Paths.get("bear/polar/./environment").normalize(); // w1
    System.out.println(path);
    try {
      System.out.println("Files.list(null): "+Files.list(null));
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      System.out.println("Files.exists(null): "+Files.exists(null));
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(Files.list(path)
      .filter(p -> !Files.isDirectory(p)) // w2
      .map(p -> p) // w3
      .collect(Collectors.toSet())
      .size());
  }
}
