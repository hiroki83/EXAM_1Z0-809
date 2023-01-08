package chapter10.statement;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestDDLWithExecuteQueryMethod {
  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
         Statement stmt = conn.createStatement()) {
      //ResultSet rs = stmt.executeQuery("DELETE FROM animal WHERE id = 100");// No results were returned by the query.
      //stmt.executeQuery("INSERT INTO species values (10, 'Deer', 3)");// No results were returned by the query.
      int result = stmt.executeUpdate("DELETE FROM species WHERE id = 10");
      System.out.println(result);
    }
  }
}
