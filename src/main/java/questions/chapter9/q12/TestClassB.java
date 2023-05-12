package questions.chapter9.q12;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.net.URI;

public class TestClassB {
  public static void main(String ... args) {
    Path path = FileSystems.getDefault().getPath("puma.txt");
  }
}
