package questions.chapter8.q12;

import java.io.File;

public class TestClassA {
  public static void main(String ... args) {
    //File file = new File("Users:\hirokiinoue\Practice1Z0809\src\main\resources\questions\chapter8\q12\java");// NOT COMPILE
    File file = new File("Users:\\hirokiinoue\\Practice1Z0809\\src\\main\\resources\\questions\\chapter8\\q12\\java");// file not exists
    //File file = new File("//Users//hirokiinoue//Practice1Z0809//src//main//resources//questions//chapter8//q12//java");// file exist
    //File file = new File("/Users/hirokiinoue/Practice1Z0809/src/main/resources/questions/chapter8/q12/java");// file exist
    if (file.exists()) {
      System.out.println("file exist.");
      System.out.println(file.getAbsolutePath());
    }else System.out.println("file does not exist");
  }
}
