package chapter9.fileattributes.views;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class BasicFileAttributeViewSample {
  public static void main(String[] args) throws IOException {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "views", "turtles", "sea.txt"));
    BasicFileAttributeView view1 = Files.getFileAttributeView(path1, BasicFileAttributeView.class);
    BasicFileAttributes data1 = view1.readAttributes();

    System.out.println("Creation date/time: "+data1.creationTime());
    System.out.println("Last modified date/time: "+data1.lastModifiedTime());
    System.out.println("Last accessed date/time: "+data1.lastAccessTime());

    FileTime lastModifiedTime = FileTime.fromMillis(data1.lastModifiedTime().toMillis()+10_000_000);
    view1.setTimes(lastModifiedTime, null, null);

    BasicFileAttributes data2 = Files.readAttributes(path1, BasicFileAttributes.class);
    System.out.println();
    System.out.println("Creation date/time: "+data2.creationTime());
    System.out.println("Last modified date/time: "+data2.lastModifiedTime());
    System.out.println("Last accessed date/time: "+data2.lastAccessTime());
  }
}
