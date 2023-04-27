package chapter8.streams.buffered;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class CopyBufferFileSample {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//buffered//";

  public static void copy(File source, File destination) throws IOException {
    try (InputStream in = new BufferedInputStream(new FileInputStream(source));
         OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
      byte[] buffer = new byte[1024];
      int lengthRead;
      while((lengthRead = in.read(buffer)) > 0) {
        out.write(buffer,0,lengthRead);
        out.flush();
      }
    }
  }
  public static void main(String[] args) throws IOException {
    File source = new File(parent, "Zoo.txt");
    File destination = new File(parent, "ZooCopy.txt");
    copy(source, destination);
  }
}
