package examtopics.q12;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util.List;
import java.io.IOException;
import java.io.File;

public class TestClassA {
  public static void main(String ... args) throws IOException {
    String rootPath = "C:\\Users\\a859432\\git_repository\\EXAM_1Z0-809\\src\\main\\resources\\examtopics\\q12\\";
    //String rootPath = "/c/Users/a859432/git_repository/EXAM_1Z0-809/src/main/resources/examtopics/q12/";
    Path file = Paths.get(rootPath, "courses.txt");
    // line n1
    //List<String> fc = Files.list(file); // DOES NOT COMPILE
    //fc.stream().forEach(s -> System.out.println(s));
    //Stream<Path> fc = Files.list(file); // thorws a NotDirectoryException at runtime
    //fc.forEach(s -> System.out.println(s));
    File fc = file.toFile();
    File[] fileList = fc.listFiles();
    if (fileList != null) {
      for (int i = 0; i<fileList.length; i++) {
      }
    } else {
      System.out.println("result of listFiles() is null.");
    }
  }
}
