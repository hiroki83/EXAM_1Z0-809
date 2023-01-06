package chapter8.streams.file.character;

import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//file//character//";

  public static void copy(File source, File destination) throws IOException {
    try (Reader in = new FileReader(source);
         Writer out = new FileWriter(destination)) {
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
