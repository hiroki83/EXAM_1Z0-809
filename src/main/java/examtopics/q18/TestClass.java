package examtopics.q18;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * Given the content of /resourses/Message.properties:
 * welcome1="Good day!"
 *
 */
public class TestClass {
  public static void main(String ... args) throws IOException {
    String propertyFilePath = "C:\\Users\\a859432\\git_repository\\EXAM_1Z0-809\\src\\main\\resources\\examtopics\\q18\\Message.properties";
    //String propertyFilePath = "/c/Users/a859432/git_repository/EXAM_1Z0-809/src/main/resources/examtopics/q18/Message.properties";
    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream(propertyFilePath);
    prop.load(fis);
    System.out.println(prop.getProperty("welcome1"));
    System.out.println(prop.getProperty("welcome2", "Test")); // line n1
    System.out.println(prop.getProperty("welcome3"));
  }
}
