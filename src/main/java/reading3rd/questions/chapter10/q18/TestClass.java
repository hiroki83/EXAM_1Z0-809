package reading3rd.questions.chapter10.q18;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String sql = "select name from animal order by name";
    try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
      rs.absolute(0); // throws SQLException at runtime. (The 'absolute()' method is only allowed on scroll cursors.
      rs.next();
      System.out.println(rs.getString(1));
    }
  }
}
