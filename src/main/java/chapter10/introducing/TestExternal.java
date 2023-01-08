package chapter10.introducing;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestExternal {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("org.postgresql.Driver");
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS)) {
      System.out.println(conn);
    }
  }
}
