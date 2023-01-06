package chapter9.fileattributes.ownership;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipal;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "ownership", "chicken", "feathers.txt"));
    try {
      UserPrincipal owner1 = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("hirokiinoue");
      UserPrincipal owner2 = path1.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("postgres");
      System.out.println("owner1: "+owner1);
      System.out.println("owner2: "+owner2);

      // Read owner of file
      System.out.println(Files.getOwner(path1).getName());
      // Change owner of file
      Files.setOwner(path1, owner2);// throw FileSystemException: Operation not permitted.

      // Output the updated owner information
      System.out.println(Files.getOwner(path1).getName());
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
