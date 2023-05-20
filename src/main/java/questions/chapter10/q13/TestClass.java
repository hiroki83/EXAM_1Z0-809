package questions.chapter10.q13;

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
    //try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
      Statement stmt = conn.createStatement()
      ) {
      ResultSet rs = stmt.executeQuery("select count(*) from species");
      int num = stmt.executeUpdate("INSERT INTO species VALUES (3, 'Ant', .05)");
      rs.next();
      System.out.println(rs.getInt(1));
    }
  }
}
