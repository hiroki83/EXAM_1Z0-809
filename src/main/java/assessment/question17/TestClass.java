package assessment.question17;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.File;
import java.util.stream.Collectors;
public class TestClass {
  public static void main(String[] args) throws Exception {
    Path path = Paths.get("/Users/hirokiinoue/Practice1Z0809/gorilla/signed-words.txt");

    //Files.find(path.getParent(), 10.0, // k1 DOES NOT COMPILE
    Files.find(path.getParent(), 10,
      //(Path p) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2 DOES NOT COMPILE
      (Path p, BasicFileAttributes b) -> p.toString().endsWith(".txt") && Files.isDirectory(p))
      .collect(Collectors.toList())
      .forEach(System.out::println);

    Files.readAllLines(path) // k3
      //.flatMap(p -> Stream.of(p.split(" "))) // k4 DOES NOT COMPILE
      //.map(s -> s.toLowerCase())
      .forEach(System.out::println);
  }
}
