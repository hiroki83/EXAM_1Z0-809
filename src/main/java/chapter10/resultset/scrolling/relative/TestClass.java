package chapter10.resultset.scrolling.relative;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import static chapter10.Chapter10Constants.CONN_STR;
import static chapter10.Chapter10Constants.DB_USER;
import static chapter10.Chapter10Constants.DB_PASS;

public class TestClass {
  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS); Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); ResultSet rs = stmt.executeQuery("SELECT id FROM animal order by id");) {
       
       System.out.println(rs.next());
       System.out.println(rs.getString("id"));
       System.out.println(rs.relative(2));
       System.out.println(rs.getString("id"));
       System.out.println(rs.relative(-1));
       System.out.println(rs.getString("id"));
       System.out.println(rs.relative(4));
       System.out.println(rs.getString("id"));// throws SQLException
    }
  }
}
