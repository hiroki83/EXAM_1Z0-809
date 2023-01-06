package chapter9.fileattributes.common;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "common", "canine", "coyote", "fur"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "common", "canine", "types.txt"));
    Path path3 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "common", "canine", "coyotes"));
    Path path4 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "common", "canine", "wolfs"));
    System.out.println(Files.isDirectory(path1));
    System.out.println(Files.isRegularFile(path2));
    System.out.println(Files.isSymbolicLink(path3));
    System.out.println(Files.isSymbolicLink(path4));
    System.out.println(Files.isDirectory(path3));
    System.out.println(Files.isRegularFile(path4));
  }
}
