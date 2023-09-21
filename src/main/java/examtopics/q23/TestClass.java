package examtopics.q23;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    Path source = Paths.get("/data/december/log.txt");
    Path destination = Paths.get("/data");
    Files.copy(source, destination);
  }
}
