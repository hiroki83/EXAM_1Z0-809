package chapter10.introducing;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyFirstDatabaseConnection {
  public static void main(String[] args) throws SQLException {
    String url = "jdbc:postgresql://localhost:5432/zoo";
    try (Connection conn = DriverManager.getConnection(url, "postgres", "sa");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT name FROM animal")) {
      while (rs.next())
        System.out.println(rs.getString(1));
    }
  }
}
