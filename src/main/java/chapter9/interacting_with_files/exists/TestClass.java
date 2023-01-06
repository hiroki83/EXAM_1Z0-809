package chapter9.interacting_with_files.exists;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import static chapter9.Chapter9Constants.REL_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    Path path2 = Paths.get("", Chapter9Utils.getDirPath(REL_DIR_PATH));
    System.out.println(Files.exists(path1));
    System.out.println(Files.exists(path2));// true -> executed directory /Users/hirokiinoue/Practice1Z0809, false -> executed directory differ from the directory of true case.
  }
}
