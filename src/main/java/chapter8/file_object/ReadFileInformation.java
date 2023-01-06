package chapter8.file_object;

import java.io.File;

public class ReadFileInformation {
  public static void main(String[] args) {
    File file1 = new File("//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//file_object//zoo.txt");
    File file2 = new File("//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//file_object");
    printInformation(file1);
    printInformation(file2);
  }

  private static void printInformation(File file) {
    System.out.println("File Exixts: "+file.exists());
    if(file.exists()) {
      System.out.println("Absolute Path: "+file.getAbsolutePath());
      System.out.println("Is Directory: "+file.isDirectory());
      System.out.println("Parent Path: "+file.getParent());
      if(file.isFile()) {
        System.out.println("File size: "+file.length());
        System.out.println("File LastModified: "+file.lastModified());
      } else {
        for (File subfile : file.listFiles()) {
          System.out.println("\t"+subfile.getName());
        }
      }
    }
  }
}
