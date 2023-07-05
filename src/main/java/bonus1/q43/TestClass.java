package bonus1.q43;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
   Path path = Paths.get("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus1/q43/zoo/gorilla.txt");
   try (BufferedReader reader = Files.newBufferedReader(path)) { // x1
     String s = null;
     while(reader.readLine() != null) // x2
       System.out.println(s); // x3
   }
  }
}
