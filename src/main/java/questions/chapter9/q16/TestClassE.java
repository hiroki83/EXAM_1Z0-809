package questions.chapter9.q16;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;

public class TestClassE {
  public static void main(String ... args) {
    Path path = Paths.get("src/main/resources/questions/chapter9/q16/squid/food-schedule_without_commas.csv");
    try {
      Files.lines(path) // r1
        .flatMap(p -> Stream.of(p.split(","))) // r2
        .map(s -> s.toUpperCase()) // r3
        .forEach(System.out::println);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
