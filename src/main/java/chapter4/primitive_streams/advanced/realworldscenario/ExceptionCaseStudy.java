package chapter4.primitive_streams.advanced.realworldscenario;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;
//import chapter4.primitive_streams.advanced.realworldscenario.ExceptionCaseStudyHelper;

public class ExceptionCaseStudy {
  public static void main(String[] args) throws Exception {
    System.out.println("START main");
    ExceptionCaseStudy.create().stream().count();
    //Supplier<List<String>> s = ExceptionCaseStudy::create;// DOES NOT COMPILE
    // solution1
    Supplier<List<String>> s1 = () -> {
      try {
        //return ExceptionCaseStudy.create();
        System.out.println("call create");
        return create();
      } catch (IOException e) {
        System.out.println("solution1");
        throw new RuntimeException(e);
      }
    };
    s1.get();
    System.out.println("E N D main");
  }
  //private static List<String> create() throws IOException {
  static List<String> create() throws IOException {
    System.out.println("START create");
    throw new IOException();
  }
}
class ExceptionCaseStudyHelper {
  public static void main(String[] args) {
    Supplier<List<String>> s2 = ExceptionCaseStudyHelper::createSafer;
    s2.get();
  }
  private static List<String> createSafer() {
    try {
      return ExceptionCaseStudy.create();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
