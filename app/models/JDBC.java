import java.sql.*;
import play.db.*;

public class JDBC {
// play does not execute this main method.
/**  public static void main(String[] args) {

      try {
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          System.out.println("JDBC Class found");
       }
       catch(ClassNotFoundException e) {
          System.out.println("Class not found "+ e);
       }



    try {
      Connection con = DB.getConnection();

      Statement stmt = con.createStatement();
      String strCreateTorte =
    		  "CREATE TABLE Torte (" +
						"id  smallint,"	+
						"name VARCHAR(50), " +
						"pfad  VARCHAR(100)," +
						"beschr VARCHAR(150)" +
						"preis smallint," +
						")";
      stmt.executeUpdate(strCreateTorte);
      String strInsertIntoTorte =
	          "INSERT INTO Torte VALUES (" +
	        		  	"001" +
	        		  	"'Geburtstagstorte'"       +
	        		  	"'@routes.Assets.at(\"images/Torte_003.jpg\")'"  +
	        		  	"'leckere Geburtstagstorte mit einer Überraschung'" +
	        		  	"50" +
	          ")";
      stmt.executeUpdate(strInsertIntoTorte);

      ResultSet rs = stmt.executeQuery("SELECT * FROM Torte");
      rs.next();
      System.out.print(rs.getString(1) + ", ");
      System.out.println(rs.getInt(2));

      stmt.executeUpdate("DROP TABLE Torte");

      rs.close();
      stmt.close();
      con.close();
    } catch (SQLException e) {
      while (e != null) {
        System.out.println(e.toString());
        System.out.println("ErrorCode: " + e.getErrorCode());
        System.out.println("SQLState: " + e.getSQLState());
        e = e.getNextException();
      }
    }

  }*/
}
