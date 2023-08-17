package bonus2.q57;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    Path path = Paths.get("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q57/baboon.txt");
    BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
    BasicFileAttributes data = view.readAttributes(); // x1
    view.setTimes(null,null,null); // x2
  }
}
