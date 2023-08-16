package bonus2.q16;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

// execute
// java -cp /Users/hirokiinoue/.m2/repository/org/postgresql/postgresql/42.6.0/postgresql-42.6.0.jar:target/Practice1Z0809-1.0-SNAPSHOT.jar bonus2.q16.TestClass

// insert data
// insert into animal (id,name) values (1, 'bonus2 q16');
// insert into animal (id,name) values (2, 'bonus2 q16');
// insert into animal (id,name) values (3, 'bonus2 q16');
// insert into animal (id,name) values (4, 'bonus2 q16');
// insert into animal (id,name) values (5, 'bonus2 q16');

public class TestClass {
  public static void main(String ... args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/zoo");
    Statement stmt = conn.createStatement();
    //int result = stmt.executeQuery("update animal set name = name");// DOES NOT COMPILE
    int result = stmt.executeUpdate("update animal set name = name");
    System.out.println(result);
  }
}
