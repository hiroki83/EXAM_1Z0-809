package chapter9.using_path_object;

import java.nio.file.Path;
import java.nio.file.Paths;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import static chapter9.Chapter9Constants.REL_DIR_PATH;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    System.out.println("The Path Name is: "+path1);
    for (int i = 0; i<path1.getNameCount(); i++)
      System.out.println("    Element "+i+" is: "+path1.getName(i));
    // Checking Path Type with isAbsolute() and toAbsolutPath()
    System.out.println("Path1 is Absolute? " + path1.isAbsolute());
    System.out.println("Absolute Path1: "+path1.toAbsolutePath());

    Path path2 = Paths.get("", Chapter9Utils.getDirPath(REL_DIR_PATH));
    System.out.println("Path2 is Absolute? " + path2.isAbsolute());
    System.out.println("Absolute Path2: "+path2.toAbsolutePath());

    System.out.println(Paths.get("c:/goats/Food.java").isAbsolute());

    // Creating a New Path with subpath()
    Path path3 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH));
    System.out.println("Path is: "+path3);
    System.out.println("Subpath from 0 to 3 is: "+path3.subpath(0,3));
    System.out.println("Subpath from 1 to 3 is: "+path3.subpath(1,3));
    System.out.println("Subpath from 1 to 2 is: "+path3.subpath(1,2));

    try {
      System.out.println("Subpath from 0 to 11 is: "+path3.subpath(0,11));
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      System.out.println("Subpath from 0 to 0 is: "+path3.subpath(0,0));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
