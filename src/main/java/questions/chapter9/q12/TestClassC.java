package questions.chapter9.q12;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.net.URI;
import java.net.URISyntaxException;

public class TestClassC {
  public static void main(String ... args) throws URISyntaxException {
    //Path path = Paths.get(new URI("cheetah.txt"));// COMPILE ERROR
    Path path = Paths.get(new URI("file:///cheetah.txt"));
    //Path path = Paths.get(new URI("file://cheetah.txt"));// RuntimeException (IllegalArgumentException: URI has an authority component)
  }
}
