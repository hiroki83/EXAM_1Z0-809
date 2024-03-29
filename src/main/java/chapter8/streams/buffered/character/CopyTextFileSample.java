package chapter8.streams.buffered.character;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;
import java.util.ArrayList;

public class CopyTextFileSample {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//buffered//character//";
  public static List<String> readFile(File source) throws IOException {
    List<String> data = new ArrayList<String>();
    try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
      String s;
      while((s = reader.readLine()) != null) {
        data.add(s);
      }
    }
    return data;
  }

  public static void writeFile(List<String> data, File destination) throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
      for(String s: data) {
        writer.write(s);
        writer.newLine();
      }
    }
  }
  public static void main(String[] args) throws IOException {
    File source = new File(parent, "Zoo.csv");
    File destination = new File(parent, "ZooCopy.csv");
    List<String> data = readFile(source);
    for (String record: data) {
      System.out.println(record);
    }
    writeFile(data, destination);
  }
}
