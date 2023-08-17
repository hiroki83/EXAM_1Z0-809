package bonus2.q31;

// execute command
// java -cp /Users/hirokiinoue/.m2/repository/org/postgresql/postgresql/42.6.0/postgresql-42.6.0.jar:target/Practice1Z0809-1.0-SNAPSHOT.jar bonus2.q31.TestClass

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String url = "jdbc:postgresql://localhost:5432/zoo";
    String sql = "select count(*) from animal";
    try (Connection conn = DriverManager.getConnection(url);
         Statement stmt = conn.createStatement()) {
      ResultSet rs = stmt.executeQuery(sql);
      if (rs.next()) {
       int num = rs.getInt(1);
        System.out.println(num);
      }
      rs.close();
    }
  }
}
