package bonus2.q59;

// execute command
// ava -cp /Users/hirokiinoue/.m2/repository/org/postgresql/postgresql/42.6.0/postgresql-42.6.0.jar:target/Practice1Z0809-1.0-SNAPSHOT.jar bonus2.q59.TestClass

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    //String connectionString = "jdbc:postgresql://localhost:5432"; // throw PSQLException at runtime
    String connectionString = "jdbc:postgresql://localhost:5432/zoo";
    try(Connection conn = DriverManager.getConnection(connectionString);
        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery("select * from animal")) {
        while(results.next())
          System.out.println(results.getInt(1));
    }
  }
}
