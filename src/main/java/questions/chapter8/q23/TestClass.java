package questions.chapter8.q23;

import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClass {
  public static void main(String ... args) throws FileNotFoundException, IOException {
    InputStream is = new BufferedInputStream(new FileInputStream("src/main/resources/questions/chapter8/q23/readme.txt"));
    System.out.println(pullBytes(is, 3));
  }
  public static String pullBytes(InputStream is, int count) throws IOException {
    is.mark(count);
    final StringBuilder sb = new StringBuilder();
    for(int i=0; i<count; i++)
      sb.append((char)is.read());
    is.reset();
    is.skip(1);
    sb.append((char)is.read());
    return sb.toString();
  }
}
