package bonus2.q39;

// execute command
// java -cp /Users/hirokiinoue/.m2/repository/org/postgresql/postgresql/42.6.0/postgresql-42.6.0.jar:target/Practice1Z0809-1.0-SNAPSHOT.jar bonus2.q39.TestClass

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String sql = "select name from animal where id in (101,102,103) order by name";
    try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/zoo");
         Statement stmt = conn.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
         ResultSet rs = stmt.executeQuery(sql)) {
      
      System.out.println("first next     : "+rs.next());
      System.out.println("second next    : "+rs.next());
      System.out.println("first previous : "+rs.previous());
      System.out.println("second previous: "+rs.previous());
      System.out.println("third previous : "+rs.previous());
      //rs.next();
      //rs.absolute(2);
      System.out.println(rs.getString(1));
    }
  }
}
