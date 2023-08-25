package bonus3.q06;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileVisitOption;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    String rootPath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus3/q06/";
    Path path = Paths.get(rootPath, "owl/food/nocturnal.png").getParent();

    Files.walk(path, 5, FileVisitOption.FOLLOW_LINKS) // b1
         .filter(p -> p.resolve(p).getFileName().toString().endsWith(".txt")) // b2
         //.filter(p -> p.getNameCount(0)>4) // b3 DOES NOT COMPILE
         .filter(p -> p.getNameCount()>4) // b3
         .forEach(p -> {
           try {
             System.out.println(p.toRealPath());
           } catch(IOException e) {
             e.printStackTrace();
             //throw new RuntimeException(e);
           }
         });
  }
}
