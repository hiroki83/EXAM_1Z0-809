package bonus1.q4;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClass {
  public static void main(String ... args) throws FileNotFoundException, IOException {
    InputStream in = new FileInputStream(new File(""));
    OutputStream out = new FileOutputStream(new File(""));
    final byte[] buffer = new byte[100];
    int lengthRead;
    while ((lengthRead = in.read(buffer)) > 0) {
      out.flush();
      //out.write(buffer, lengthRead);// DOES NOT COMPILE
      out.write(buffer, 0, lengthRead);
      out.flush();
    }
  }
}
