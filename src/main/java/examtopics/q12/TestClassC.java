package examtopics.q12;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util.List;
import java.io.IOException;

public class TestClassC {
  public static void main(String ... args) throws IOException {
    String rootPath = "C:\\Users\\a859432\\git_repository\\EXAM_1Z0-809\\src\\main\\resources\\examtopics\\q12\\";
    Path file = Paths.get(rootPath, "courses.txt");
    // line n1
    //List<String> fc = readAllLines(file); // DOES NOT COMPILE
    List<String> fc = Files.readAllLines(file);
    fc.stream().forEach(s -> System.out.println(s));
  }
}
