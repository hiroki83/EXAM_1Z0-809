package questions.chapter10.q11;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClassA {
  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
      Statement stmt = conn.createStatement()) {
      int result = stmt.executeUpdate("update food set amount = amount + 1");
      System.out.println(result);
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
}
