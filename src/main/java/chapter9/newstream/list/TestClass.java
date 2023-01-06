package chapter9.newstream.list;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;
import java.util.stream.Stream;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "newstream", "list", "zoo", "ducks"));
    try {
      Files.list(path1).filter(p -> !Files.isDirectory(p)).map(p -> p.toAbsolutePath()).forEach(System.out::println);
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
