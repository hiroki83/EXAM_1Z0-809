package chapter9.newstream.find;

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
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "newstream", "find", "bigcats"));
    long dateFilter = 1420070400000L;
    try {
      Stream<Path> stream = Files.find(path1, 10, (p,a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis()>dateFilter);
      stream.forEach(System.out::println);
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
