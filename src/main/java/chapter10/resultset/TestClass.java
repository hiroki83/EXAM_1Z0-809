package chapter10.resultset;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;
import java.util.Map;
import java.util.HashMap;

public class TestClass {
  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS); 
         Statement stmt1 = conn.createStatement();
         Statement stmt2 = conn.createStatement();
         Statement stmt3 = conn.createStatement();
         ResultSet rs1 = stmt1.executeQuery("SELECT id, name FROM species");
         ResultSet rs2 = stmt2.executeQuery("SELECT id, name FROM species");
         ResultSet rs3 = stmt3.executeQuery("SELECT id, name FROM species");) {

      Map<Integer, String> idToNameMap1 = new HashMap<>();
      while(rs1.next()) {
        int id = rs1.getInt("id");
        String name = rs1.getString("name");
        idToNameMap1.put(id, name);
      }
      System.out.println(idToNameMap1);

      Map<Integer, String> idToNameMap2 = new HashMap<>();
      while(rs2.next()) {
        int id = rs2.getInt(1);
        String name = rs2.getString(2);
        idToNameMap2.put(id, name);
      }
      System.out.println(idToNameMap2);

      Map<Integer, String> idToNameMap3 = new HashMap<>();
      if (rs3.next()) {
        System.out.println(rs3.getInt(1));
      }
    }
  }
}
