package examtopics.q13;

import java.io.IOException;
import java.io.File;

public class TestClass {
  public void recDelete(String dirName) throws IOException {
    File[] listOfFiles = new File(dirName).listFiles();
    if(listOfFiles != null && listOfFiles.length> 0) {
      for (File aFile : listOfFiles) {
        if (aFile.isDirectory()) {
          recDelete(aFile.getAbsolutePath());
        } else {
          if (aFile.getName().endsWith(".class"))
            aFile.delete();
        }
      }
    }
  }
  public static void main(String ... args) throws IOException {
    String dirName = "/Users/hirokiinoue/git_repositories/EXAM_1Z0-809/src/main/resources/examtopics/q13";
    TestClass t = new TestClass();
    t.recDelete(dirName);
  }
}
