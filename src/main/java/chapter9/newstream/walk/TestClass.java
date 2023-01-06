package chapter9.newstream.walk;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "newstream", "walk", "bigcats"));
    try {
      Files.walk(path1).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
