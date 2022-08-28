package chapter3.lower_bounded_wildcards;

import java.util.*;
import java.io.*;

public class TestClass5 {
  public static void main(String[] args) {
    List<? super IOException> exceptions = new ArrayList<>();
    //exceptions.add(new Exception());// DOES NOT COMPILE
    exceptions.add(new IOException());
    exceptions.add(new FileNotFoundException());
  }
}
