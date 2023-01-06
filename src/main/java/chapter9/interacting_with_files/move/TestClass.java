package chapter9.interacting_with_files.move;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "move", "zoo"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "move", "zoo-new"));
    Path path3 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "move", "person", "addresses.txt"));
    Path path4 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "move", "zoo-new", "addresses2.txt"));
    Path path5 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "move", "person"));
    Path path6 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "move", "company"));
    try {
      if(!Files.exists(path2)) {
        Files.move(path1, path2);
        System.out.println("Moved: "+path2);
      }
      if(!Files.exists(path4)) {
        Files.move(path3, path4);
        System.out.println("Moved: "+path4);
      }
      if(!Files.exists(path6)) {
        Files.move(path5, path6);
        System.out.println("Moved: "+path6);
      }
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
