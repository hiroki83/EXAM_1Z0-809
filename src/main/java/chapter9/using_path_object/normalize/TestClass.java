package chapter9.using_path_object.normalize;

import java.nio.file.Path;
import java.nio.file.Paths;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    //Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    Path path1 = Paths.get("/opt/data");
    Path path2 = Paths.get("/opt/user/home");

    Path relativePath = path1.relativize(path2);
    System.out.println(path1.resolve(relativePath));
    System.out.println(path1.resolve(relativePath).normalize());
  }
}
