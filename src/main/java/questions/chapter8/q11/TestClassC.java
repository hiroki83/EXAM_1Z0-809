package questions.chapter8.q11;

import java.io.File;
import java.io.IOException;

public class TestClassC {
  public static void main(String ... args) throws IOException {
    File file = new File("");
    file.mkdirs();
  }
}
