package examtopics.q12;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util.List;
import java.io.IOException;

public class TestClassD {
  public static void main(String ... args) throws IOException {
    String rootPath = "C:\\Users\\a859432\\git_repository\\EXAM_1Z0-809\\src\\main\\resources\\examtopics\\q12\\";
    Path file = Paths.get(rootPath, "courses.txt");
    // line n1
    Stream<String> fc = Files.lines(file);
    fc.forEach(s -> System.out.println(s));
  }
}
