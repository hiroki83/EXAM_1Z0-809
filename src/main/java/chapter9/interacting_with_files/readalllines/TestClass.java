package chapter9.interacting_with_files.readalllines;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "interacting_with_files", "readalllines", "fish", "sharks.log"));
    try {
      final List<String> lines = Files.readAllLines(path1);
      for(String line: lines)
        System.out.println(line);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
