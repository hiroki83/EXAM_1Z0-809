package questions.chapter9.q20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
  public static void main(String ... args) {
    final Path path1 = Paths.get(".");
    System.out.println(path1);
    final Path path2 = Paths.get(".").normalize(); // h1
    System.out.println(path2);
    int count = 0;
    System.out.println(path2.getNameCount());
    for(int i = 0; i<path2.getNameCount(); ++i) {
      count++;
    }
    System.out.println(count);
    count = 0;
    for(int i = 0; i<path2.getNameCount(); i++) {
      count++;
    }
    System.out.println(count);
    final Path path3 = Paths.get("/");
    count = 0;
    for(int i = 0; i<path3.getNameCount(); i++) {
      count++;
    }
    System.out.println(count);
  }
}
