package bonus2.q50;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) {
    String rootPath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q50";
    Path path1 = Paths.get(rootPath,"dir1");
    Path path2 = Paths.get(rootPath,"dir2");
    Path path3 = Paths.get(rootPath,"dir3");
    Path path4 = Paths.get(rootPath,"dir4");
    try {
      Files.move(path1,path2,StandardCopyOption.REPLACE_EXISTING);
      Files.move(path3,path4,StandardCopyOption.REPLACE_EXISTING);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
