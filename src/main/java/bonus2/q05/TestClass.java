package bonus2.q05;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestClass {
  public static String pullBytes(InputStream is, int count) throws IOException {
    final StringBuilder sb = new StringBuilder();
    sb.append((char)is.read());
    if(is.markSupported()) {
      is.mark(100);
      for(int i = 0; i < count; i++)
        sb.append((char)is.read());
      is.skip(20);
      is.reset();
    }
    sb.append((char)is.read());
    return sb.toString();
  }
  public static void main(String ... args) throws FileNotFoundException, IOException {
    String filePath = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus2/q05/fileq05.txt";
    InputStream in = new FileInputStream(filePath);
    System.out.println(pullBytes(in, 2));
  }
}
