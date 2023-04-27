package questions.chapter8.q11;

import java.io.File;
import java.io.IOException;

public class TestClassE {
  public static void main(String ... args) throws IOException {
    File file = new File("");
    File fileRenamed = new File("");
    file.renameTo(fileRenamed);
  }
}
