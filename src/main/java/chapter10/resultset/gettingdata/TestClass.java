package chapter10.resultset.gettingdata;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TestClass {
  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS); 
         Statement stmt1 = conn.createStatement();
         Statement stmt2 = conn.createStatement();
         Statement stmt3 = conn.createStatement();
         Statement stmt4 = conn.createStatement();
         ResultSet rs1 = stmt1.executeQuery("SELECT date_born FROM animal WHERE name = 'Elsa'");
         ResultSet rs2 = stmt2.executeQuery("SELECT date_born FROM animal WHERE name = 'Elsa'");
         ResultSet rs3 = stmt3.executeQuery("SELECT date_born FROM animal WHERE name = 'Elsa'");
         ResultSet rs4 = stmt4.executeQuery("SELECT id, name FROM species");) {

      if (rs1.next()) {
        Date sqlDate = rs1.getDate("date_born");
        LocalDate localDate = sqlDate.toLocalDate();
        System.out.println(localDate);
      }

      if (rs2.next()) {
        Time sqlTime = rs2.getTime("date_born");
        LocalTime localTime = sqlTime.toLocalTime();
        System.out.println(localTime);
      }

      if (rs3.next()) {
        Timestamp timestamp = rs3.getTimestamp("date_born");
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        System.out.println(localDateTime);
      }
      
      while (rs4.next()) {
        Object idField = rs4.getObject("id");
        Object nameField = rs4.getObject("name");
        if(idField instanceof Integer) {
          int id = (Integer) idField;
          System.out.println(id);
        }
        if(nameField instanceof String) {
          String name = (String) nameField;
          System.out.println(name);
        }
      }
    }
  }
}
