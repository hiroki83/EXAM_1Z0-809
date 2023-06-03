package bonus1.q5;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.net.URI;

public class TestClass {
  public static void main(String ... args) {
    URI uri = new File("elephant").toURI(); // x1
    Path path = Paths.get(uri).toAbsolutePath(); // x2
    //System.out.println(path.relativize(Paths.get("zoo")));// DOES NOT COMPILE
    System.out.println(path.relativize(Paths.get("zoo").toAbsolutePath()));
  }
}
