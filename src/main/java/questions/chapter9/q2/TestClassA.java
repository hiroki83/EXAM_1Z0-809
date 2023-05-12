package questions.chapter9.q2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class TestClassA {
  public static void main(String ... args) {
    Path path = Paths.get("src/main/resources/questions/chapter9/q2/review_question_no2_A.txt");
    //Path path = Paths.get("src","main","resources","questions","chapter9","q2","review_question_no2_A.txt");
    System.out.println(Files.exists(path));
    if(Files.isDirectory(path)) {
      try {
        System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
}
