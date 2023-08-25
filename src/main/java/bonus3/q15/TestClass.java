package bonus3.q15;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass {
  public static void main(String ... args) throws SQLException {
    String url = "";
    String userName = "";
    String password = "";
    String sql = "";
    Connection a = DriverManager.getConnection(url, userName, password);
    Statement b = a.createStatement();
    ResultSet c = b.executeQuery(sql);
    if (c.next()) System.out.println(c.getString(1));
  }
}
