package chapter10.exceptions;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestClass {
  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT not_a_column FROM animal");) {
      while (rs.next())
        System.out.println(rs.getString(1));
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getSQLState());
      System.out.println(e.getErrorCode());
    }
  }
}
