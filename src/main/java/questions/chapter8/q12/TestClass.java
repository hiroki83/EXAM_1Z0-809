package questions.chapter8.q12;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;

public class TestClass {
  public static void main(String ... args) throws IOException {
    System.out.println(System.getProperty("user.dir"));
    //File file = new File("testhiroki.sh"); // file exist
    //File file = new File("src/main/resources/questions/chapter8/q12/java"); file exist
    InputStream file = TestClass.class.getResourceAsStream("java");
    //if (file.exists()) System.out.println("file exists");
    if (file.available() >= 0) System.out.println("file exists");
    else System.out.println("file does not exists");
  }
}
