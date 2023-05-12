package chapter9.interacting_with_files.issamefile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "snake.txt"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "cobra.txt"));
    Path path3 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "tree", "..", "monkey.txt"));
    Path path4 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "monkey.txt"));
    Path path5 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", ".", "giraffe.txt"));
    Path path6 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "giraffe.txt"));
    Path path7 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "flamingo", "tail.txt"));
    Path path8 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "cardinal", "tail.txt"));
    Path path9 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "flamingo", "tail1.txt"));
    Path path10 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "issamefile", "cardinal", "tail1.txt"));
    try {
      System.out.println(Files.isSameFile(path1, path2));
      System.out.println(Files.isSameFile(path3, path4));
      System.out.println(Files.isSameFile(path5, path6));
      System.out.println(Files.isSameFile(path7, path8));
      System.out.println(Files.isSameFile(path9, path10));
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
