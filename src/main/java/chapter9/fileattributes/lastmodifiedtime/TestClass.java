package chapter9.fileattributes.lastmodifiedtime;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.io.IOException;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TestClass {
  public static void main(String[] args) {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "lastmodifiedtime", "rabbit", "food.txt"));
    try {
      Instant instant1 = Instant.ofEpochMilli(Files.getLastModifiedTime(path1).toMillis());
      ZonedDateTime lastModifiedTime1 = ZonedDateTime.ofInstant(instant1, ZoneOffset.UTC);
      //System.out.println(Files.getLastModifiedTime(path1).toMillis());
      System.out.println(lastModifiedTime1);
      Files.setLastModifiedTime(path1, FileTime.fromMillis(System.currentTimeMillis()));
      Instant instant2 = Instant.ofEpochMilli(Files.getLastModifiedTime(path1).toMillis());
      ZonedDateTime lastModifiedTime2 = ZonedDateTime.ofInstant(instant2, ZoneOffset.UTC);
      //System.out.println(Files.getLastModifiedTime(path1).toMillis());
      System.out.println(lastModifiedTime2);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
