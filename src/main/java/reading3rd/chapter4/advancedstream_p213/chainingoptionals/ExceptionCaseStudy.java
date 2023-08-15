package reading3rd.chapter4.advancedstream_p213.chainingoptionals;

import java.util.List;
import java.io.IOException;

public class ExceptionCaseStudy {
  protected static List<String> create() throws IOException {
    throw new IOException();
  }
  protected static List<String> createSafe() {
    try {
      return create();
    } catch(IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
  public static void main(String ... args) {
  }
}
