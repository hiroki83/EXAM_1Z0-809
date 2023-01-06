package chapter9.using_path_object.resolve;

import java.nio.file.Path;
import java.nio.file.Paths;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    //Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    final Path path1 = Paths.get("/cats/../panther");
    final Path path2 = Paths.get("food");
    System.out.println(path1.resolve(path2));
    final Path path3 = Paths.get("/turkey/food");
    final Path path4 = Paths.get("/tiger/cage");
    System.out.println(path3.resolve(path4));
  }
}
