package reading3rd.chapter3.lowerboundedwildcards_p121;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClass2 {
  public static void main(String ... args) {
    List<? super IOException> exceptions = new ArrayList<Exception>();
    //exceptions.add(new Exception()); // DOES NOT COMPILE
    exceptions.add(new IOException());
    exceptions.add(new FileNotFoundException());
  }
}
