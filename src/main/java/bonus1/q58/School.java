package bonus1.q58;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class School {
  private List<Object> exceptions;
  private List<?> names = new ArrayList<Object>();
  public School() {
    exceptions = new LinkedList<>();
  }
  public static void main(String ... args) {
    School school = new School();
    school.exceptions.add("");
    //school.names.add(new Object());//COMPILE ERROR
  }
}
