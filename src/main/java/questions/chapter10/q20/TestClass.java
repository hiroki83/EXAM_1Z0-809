package questions.chapter10.q20;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String sql = "select * from animal";
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
      Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
      ResultSet rs = stmt.executeQuery(sql);
      //System.out.println(rs.beforeFirst());// COMPILE ERROR
      rs.beforeFirst();
      System.out.println(rs.absolute(5));
      System.out.println(rs.previous());
      System.out.println(rs.relative(-2));
      //System.out.println(rs.afterLast()); // COMPILE ERROR
      rs.afterLast();
    }
  }
}
