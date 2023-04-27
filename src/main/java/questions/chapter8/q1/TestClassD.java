package questions.chapter8.q1;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class TestClassD {
  public static void main(String ... args) throws FileNotFoundException, IOException{
    InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
    InputStream wrapper = new ObjectInputStream(is);
  }
}
