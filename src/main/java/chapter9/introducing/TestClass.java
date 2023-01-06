package chapter9.introducing;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import static chapter9.Chapter9Constants.REL_DIR_PATH;
import chapter9.Chapter9Utils;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) throws IOException {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "introducing", "test.txt"));
    System.out.println("path1.toUri(): "+path1.toUri());
    Path path2 = Paths.get(path1.toUri());
    System.out.println("path2: "+path2);
    Path path3 = FileSystems.getDefault().getPath(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "introducing", "test.txt"));
    System.out.println("path3: "+path3);
    Path path4 = Paths.get("", Chapter9Utils.getDirPath(REL_DIR_PATH, "introducing", "test.txt"));
    System.out.println("path4: "+path4);
    System.out.println(path4.toRealPath());// if not be executed this program in directory /Users/hirokiinoue/Practice1Z0809 throws NoSuchFileException.
  }
}
