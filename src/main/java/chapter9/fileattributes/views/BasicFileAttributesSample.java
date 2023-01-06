package chapter9.fileattributes.views;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import chapter9.Chapter9Utils;
import static chapter9.Chapter9Constants.ABS_DIR_ROOT;
import static chapter9.Chapter9Constants.ABS_DIR_PATH;
import java.io.IOException;

public class BasicFileAttributesSample {
  public static void main(String[] args) throws IOException {
    Path path1 = Paths.get(ABS_DIR_ROOT, Chapter9Utils.getDirPath(ABS_DIR_PATH, "fileattributes", "views", "turtles", "sea.txt"));
    BasicFileAttributes data = Files.readAttributes(path1, BasicFileAttributes.class);
    System.out.println("Is path a directory? "+data.isDirectory());
    System.out.println("Is path a regular file? "+data.isRegularFile());
    System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
    System.out.println("Path not a file, directory, nor symbolic link? "+data.isOther());

    System.out.println("Size (in bytes): "+data.size());

    System.out.println("Creation date/time: "+data.creationTime());
    System.out.println("Last modified date/time: "+data.lastModifiedTime());
    System.out.println("Last accessed date/time: "+data.lastAccessTime());
    System.out.println("Unique file identifier (if available): "+data.fileKey());
  }
}
