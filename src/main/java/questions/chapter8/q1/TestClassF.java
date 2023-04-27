package questions.chapter8.q1;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class TestClassF {
  public static void main(String ... args) throws FileNotFoundException {
    InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
    //InputStream wrapper = new BufferedReader(is);// NOT COMPILE
  }
}
