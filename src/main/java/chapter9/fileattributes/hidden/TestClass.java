package chapter9.fileattributes.hidden;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "hidden", ".walrus.txt"));
    try {
      System.out.println(Files.isHidden(path1));
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
