package chapter8.streams.print;

import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterSample {
  private static final String parent = "//Users//hirokiinoue//Practice1Z0809//src//main//resources//chapter8//streams//print//";
  public static void main(String[] args) throws IOException {
    File source = new File(parent, "zoo.log");
    try(PrintWriter out = new PrintWriter(
         new BufferedWriter(new FileWriter(source)))) {
      out.print("Today's weather is: ");
      out.println("Sunny");
      out.print("Today's temperature at the zoo is: ");
      out.print(1/3.0);
      out.println('C');
      out.format("It has rained 10.12 inches this year");
      out.println();
      out.print("It may rain 21.2 more inches this year");
    }
  }
}
