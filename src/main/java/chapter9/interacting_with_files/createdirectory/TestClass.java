package chapter9.interacting_with_files.createdirectory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "createdirectory", "bison"));
    Path path2 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "createdirectory", "bison/field/pasture/green"));
    try {
      System.out.println("Does exists "+path1+" ? "+(Files.exists(path1) ? "Yes." : "No."));
      System.out.println("Does exists "+path2+" ? "+(Files.exists(path2) ? "Yes." : "No."));
      if (!Files.exists(path1))
        Files.createDirectory(path1);
        System.out.println("Does exists "+path1+" ? "+(Files.exists(path1) ? "Yes." : "No."));
      if (!Files.exists(path2))
        Files.createDirectories(path2);
        System.out.println("Does exists "+path2+" ? "+(Files.exists(path2) ? "Yes." : "No."));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
