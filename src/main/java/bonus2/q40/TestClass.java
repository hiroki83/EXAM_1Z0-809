package bonus2.q40;

// execute command
// java -cp /Users/hirokiinoue/.m2/repository/org/postgresql/postgresql/42.6.0/postgresql-42.6.0.jar:target/Practice1Z0809-1.0-SNAPSHOT.jar bonus2.q40.TestClass

// insert data query
//insert into animal (id, name, date_born) values (201, '201 bonus2 q40', current_timestamp);
//insert into animal (id, name, date_born) values (202, '202 bonus2 q40', current_timestamp);
//insert into animal (id, name, date_born) values (203, '203 bonus2 q40', current_timestamp);

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String connString = "jdbc:postgresql://localhost:5432/zoo";
    String sql = "select * from animal where id in (201, 202, 203)";
    try(Connection conn = DriverManager.getConnection(connString);
        Statement stmt = conn.createStatement()) {
      ResultSet rs = stmt.executeQuery(sql);
      if (rs.next()) {
        System.out.println(rs.getDate("date_born"));
        //System.out.println(rs.getLocalDate("date_born")); // DOES NOT COMPILE
        //System.out.println(rs.getLocalDateTime("date_born")); // DOES NOT COMPILE
        //System.out.println(rs.getLocalTime("date_born")); // DOES NOT COMPILE
        System.out.println(rs.getTime("date_born"));
        //System.out.println(rs.getTimeStamp("date_born")); // DOES NOT COMPILE
        System.out.println(rs.getTimestamp("date_born"));
      }
    }
  }
}
