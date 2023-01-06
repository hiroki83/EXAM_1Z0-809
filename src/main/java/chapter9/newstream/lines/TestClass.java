package chapter9.newstream.lines;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "newstream", "lines", "fish", "sharks.log"));
    try {
      System.out.println(Files.lines(path1).filter(s -> s.startsWith("WARN ")).map(s -> s.substring(5)).collect(Collectors.toList()));
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}
