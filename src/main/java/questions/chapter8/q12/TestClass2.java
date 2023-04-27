package questions.chapter8.q12;

import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestClass2 {
  public static void main(String ... args) throws IOException {
    File destination = new File("testhiroki.sh");
    try (OutputStream out = new FileOutputStream(destination)) {
      int b = 1;
      out.write(b);
      System.out.println(destination.getAbsolutePath());
    }
  }
}
