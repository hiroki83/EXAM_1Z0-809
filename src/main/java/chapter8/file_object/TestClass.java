package chapter8.file_object;

import java.io.File;

public class TestClass {
  public static void main(String[] args) {
    System.out.println(System.getProperty("file.separator"));
    System.out.println(File.separator);
  }
}
