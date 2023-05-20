package questions.chapter10.q18;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String sql = "select name from animal order by name";
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql)) {
      rs.absolute(0);
      rs.next();
      System.out.println(rs.getString(1));
    }
  }
}
