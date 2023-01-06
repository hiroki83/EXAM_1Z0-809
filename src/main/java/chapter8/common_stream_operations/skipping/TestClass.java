package chapter8.common_stream_operations.skipping;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class TestClass {
  public static void main(String[] args) {
    try (InputStream stream = new BufferedInputStream(new FileInputStream("//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//common_stream_operations//skipping//zoo_data.txt"))){
      System.out.print((char)stream.read());
      stream.skip(2);
      stream.read();
      System.out.print((char)stream.read());
      System.out.print((char)stream.read());
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println();
  }
}
