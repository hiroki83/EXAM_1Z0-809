package chapter9.using_path_object.torealpath;

import java.nio.file.Path;
import java.nio.file.Paths;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    try {
      System.out.println(path1.toRealPath());
      System.out.println(Paths.get("/zebra/food.source").toRealPath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
