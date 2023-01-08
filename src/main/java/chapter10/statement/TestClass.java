package chapter10.statement;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestClass {
  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
         Statement stmt = conn.createStatement()) {
      int result = stmt.executeUpdate("INSERT INTO species values (10, 'Deer', 3)");
      System.out.println(result);
      result = stmt.executeUpdate("UPDATE species SET name = '' WHERE name = 'None'");
      System.out.println(result);
      result = stmt.executeUpdate("DELETE FROM species WHERE id = 10");
      System.out.println(result);

      if (args.length == 1) {
        System.out.println("args[0]: "+args[0]);
        //System.out.println("args[1]: "+args[1]);
        boolean isResultSet = stmt.execute(args[0]);
        if (isResultSet) {
          ResultSet rs = stmt.getResultSet();
          System.out.println("ran a query");
        } else {
          result = stmt.getUpdateCount();
          System.out.println("ran a update");
        }
      }
    }
  }
}
