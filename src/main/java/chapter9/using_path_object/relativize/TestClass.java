package chapter9.using_path_object.relativize;

import java.nio.file.Path;
import java.nio.file.Paths;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    Path path2 = Paths.get("fish.txt");
    Path path3 = Paths.get("birds.txt");
    System.out.println(path2.relativize(path3));
    System.out.println(path3.relativize(path2));
    Path path4 = Paths.get("/home/habitat");
    Path path5 = Paths.get("/home/sanctuary/raven");
    System.out.println(path4.relativize(path5));
    System.out.println(path5.relativize(path4));
  }
}
