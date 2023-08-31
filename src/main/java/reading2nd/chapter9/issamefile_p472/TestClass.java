package reading2nd.chapter9.issamefile_p472;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) {
    String rootPath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/reading2nd/chapter9/issamefile_p472/";
    try {
      System.out.println("equals() method of interface Path:  " + Paths.get(rootPath, "user/home/cobra").equals(Paths.get(rootPath, "user/home/snake")));
      System.out.println("isSameFile() method of class Files: "+Files.isSameFile(Paths.get(rootPath, "user/home/cobra"), Paths.get(rootPath, "user/home/snake")));

      System.out.println("equals() method of interface Path:  " + Paths.get(rootPath, "user/tree/../monkey").equals(Paths.get(rootPath, "user/monkey")));
      System.out.println("isSameFile() method of class Files: "+Files.isSameFile(Paths.get(rootPath, "user/tree/../monkey"), Paths.get(rootPath, "user/monkey")));

      System.out.println("equals() method of interface Path:  " + Paths.get(rootPath, "leaves/./giraffe.exe").equals(Paths.get(rootPath, "leaves/giraffe.exe")));
      System.out.println("isSameFile() method of class Files: "+Files.isSameFile(Paths.get(rootPath, "leaves/./giraffe.exe"), Paths.get(rootPath, "leaves/giraffe.exe")));

      System.out.println("equals() method of interface Path:  " + Paths.get(rootPath, "flamingo/tail.data").equals(Paths.get(rootPath, "cardinal/tail.data")));
      System.out.println("isSameFile() method of class Files: "+Files.isSameFile(Paths.get(rootPath, "flamingo/tail.data"), Paths.get(rootPath, "cardinal/tail.data")));
    } catch( IOException e) {
      e.printStackTrace();
    }
  }
}
