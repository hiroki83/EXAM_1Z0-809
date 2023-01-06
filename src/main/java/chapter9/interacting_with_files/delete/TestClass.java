package chapter9.interacting_with_files.delete;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "delete", "vulture", "feathers.txt"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "delete", "pigeon"));
    try {
      if(Files.exists(path1)) {
        Files.delete(path1);
        System.out.println("Delete!! "+path1);
      }
      if(Files.deleteIfExists(path2))
        System.out.println("Delete!! "+path2);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
