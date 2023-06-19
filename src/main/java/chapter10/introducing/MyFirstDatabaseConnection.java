package chapter10.introducing;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import static chapter10.Chapter10Constants.DB_PASS;
import static chapter10.Chapter10Constants.DB_USER;

public class MyFirstDatabaseConnection {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    String url = "jdbc:postgresql://localhost:5432/zoo";
    try (Connection conn = DriverManager.getConnection(url, DB_USER, DB_PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT name FROM animal")) {
      while (rs.next())
        System.out.println(rs.getString(1));
    }
  }
}
