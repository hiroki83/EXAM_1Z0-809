package reading3rd.chapter10.setupdb_p509;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * execute command: java -cp "C:\Users\a859432\JDKs\jdk1.8.0_65\db\lib\derby.jar;target/Practice1Z0809-1.0-SNAPSHOT.jar" reading3rd.chapter10.setupdb_p509.SetupDerbyDatabase
*/
public class SetupDerbyDatabase {
  public static void main(String ... args) throws SQLException {
    String url = "jdbc:derby:zoo;create=true";
    try (Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement()) {
      ResultSet rtnValDropTableSpecies = stmt.executeQuery("DROP TABLE species"); // false
      //boolean rtnValDropTableSpecies = stmt.execute("DROP TABLE species"); // false
      //int rtnValDropTableSpecies = stmt.executeUpdate("DROP TABLE species"); // 0
      int rtnValDropTableAnimal = stmt.executeUpdate("DROP TABLE animal");
      int rtnValCreateTableSpecies = stmt.executeUpdate("CREATE TABLE species ("
      + "id INTEGER PRIMARY KEY, "
      + "name VARCHAR(255), "
      + "num_acres DECIMAL)");

      int rtnValCreateTableAnimal = stmt.executeUpdate("CREATE TABLE animal ("
      + "id INTEGER PRIMARY KEY, "
      + "species_id INTEGER, "
      + "name VARCHAR(255), "
      + "date_born TIMESTAMP)");

      int rtnValInsertSpecie1 = stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
      int rtnValInsertSpecie2 = stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");

      //int rtnValInsertAnimal1 = stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', null)");
      int rtnValInsertAnimal1 = stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
      int rtnValInsertAnimal2 = stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
      int rtnValInsertAnimal3 = stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09 10:36:00')");
      int rtnValInsertAnimal4 = stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08 01:24:00')");
      int rtnValInsertAnimal5 = stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12 03:44:00')");

      System.out.println("rntValDropTableSpecies=" + rtnValDropTableSpecies);
      System.out.println("rntValDropTableAnimal=" + rtnValDropTableAnimal);
      System.out.println("rtnValCreateTableSpecies=" + rtnValCreateTableSpecies);
      System.out.println("rtnValCreateTableAnimal=" + rtnValCreateTableAnimal);
      System.out.println("rtnValInsertSpecie1=" + rtnValInsertSpecie1);
      System.out.println("rtnValInsertSpecie2=" + rtnValInsertSpecie2);
      System.out.println("rtnValInsertAnimal1=" + rtnValInsertAnimal1);
      System.out.println("rtnValInsertAnimal2=" + rtnValInsertAnimal2);
      System.out.println("rtnValInsertAnimal3=" + rtnValInsertAnimal3);
      System.out.println("rtnValInsertAnimal4=" + rtnValInsertAnimal4);
      System.out.println("rtnValInsertAnimal5=" + rtnValInsertAnimal5);
    }
  }
}
