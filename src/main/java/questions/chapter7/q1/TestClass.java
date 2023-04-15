package questions.chapter7.q1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
//import java.util.stream.ParallelStream; // COMPILE ERROR

public class TestClass {
  public static void main(String[] args) {
    List<String> c = new ArrayList<>();
    Stream s = c.stream();
    //c.parallel();// COMPILE ERROR
    //s.parallel();
    //c.parallelStream();
    //s.parallelStream();// COMPILE ERROR
    //new ParallelStream(s);// COMPILE ERROR
    //new ParallelStream(c);// COMPILE ERROR
  }
}
