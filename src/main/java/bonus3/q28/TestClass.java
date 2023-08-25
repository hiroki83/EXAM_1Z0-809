package bonus3.q28;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class TestClass {
  public static String pullBytes(InputStream is, int count) throws IOException {
    final StringBuffer sb = new StringBuffer();
    is.skip(2);
    if (is.markSupported()) {
      is.mark(1);
      for(int i=0; i<count; i++) {
        sb.append((char)is.read());
        //System.out.println(sb);
      }
      is.reset();
    }
    //sb.append((char)is.read()+(char)is.read());
    sb.append((char)is.read());
    sb.append((char)is.read());
    System.out.println((char)is.read());
    return sb.toString();
  }
  public static void main(String ... args) {
    try {
      String s = pullBytes(new BufferedInputStream(new FileInputStream("/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/bonus3/q28/testfileq28.txt")), 3);
      System.out.println(s);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
