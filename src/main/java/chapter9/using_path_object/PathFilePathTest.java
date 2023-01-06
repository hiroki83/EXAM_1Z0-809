package chapter9.using_path_object;

import java.nio.file.Path;
import java.nio.file.Paths;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;

public class PathFilePathTest {
  public static void printPathInformation(Path path) {
    System.out.println("Filename is: "+path.getFileName());
    System.out.println("Root is: "+path.getRoot());

    Path currentParent = path;
    while((currentParent = currentParent.getParent()) != null) {
      System.out.println("   Current parent is: "+currentParent);
    }
  }

  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    printPathInformation(path1);
    System.out.println();
    printPathInformation(Paths.get("armadillo/shells.txt"));
  }
}
