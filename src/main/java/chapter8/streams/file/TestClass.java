package chapter8.streams.file;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestClass {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//file//";

  public static void copy(File source, File destination) throws IOException {
    try (InputStream in = new FileInputStream(source);
         OutputStream out = new FileOutputStream(destination)) {
      int b;
      while((b = in.read()) != -1) {
        out.write(b);
      }
    }
  }
  public static void main(String[] args) throws IOException {
    File source = new File(parent, "Zoo.txt");
    File destination = new File(parent, "ZooCopy.txt");
    copy(source, destination);
  }
}
