package examtopics.q20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass2 {
  public static void main(String ... args) {
    String rootPath = "";
    Path p1 = Paths.get(rootPath, "/Pics/MyPic.jpeg");
    System.out.println(p1.getNameCount() + ":" + p1.getName(100) + ":" + p1.getFileName());
  }
}
