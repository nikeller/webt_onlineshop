package models;

import java.sql.*;
import play.db.*;

public class JDBC {
	
	public Connection c = null;
	public Statement stmt = null;
	
	Connection connection = DB.getConnection();
	/**	
	 public void createTable()
	  {
		     try {
		      stmt = c.createStatement();
		      String strCreateTorte =
		    		  "CREATE TABLE Torte (" +
								"id  smallint PRIMARY KEY,"	+
								"name VARCHAR(50) NOT NULL, " +
								"pfad  VARCHAR(100) NOT NULL," +
								"beschr VARCHAR(150)" +
								"kategorie_id VARCHAR(50) NOT NULL" +
								"preis decimal(4,2) NOT NULL," +
								")";
		      stmt.executeUpdate(strCreateTorte);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Table created successfully");
		  }
	  
	 public void insertInto(){
		 
		 try {
			 
		      stmt = c.createStatement();
		      String strInsertIntoTorte = "INSERT INTO Torte (id,name,pfad,beschr,kategorie_id, preis) " +
		                   "VALUES (002, 'Herzliche Grüße', '@routes.Assets.at(\"images/Torte_002.jpg\")'',"
		                   + " 'Leckere Torte für unsere Lieblinge', 33.0 );"; 
		      stmt.executeUpdate(strInsertIntoTorte);

		      strInsertIntoTorte = "INSERT INTO Torte (id,name,pfad,beschr,kategorie_id, preis) " +
	                   "VALUES (003, 'Hochzeitstorte', '@routes.Assets.at(\"images/Torte_003.jpg\")'',"
	                   + " 'Dreistöckige Torte für besondere Anlässe', 70.50 );"; 
		      stmt.executeUpdate(strInsertIntoTorte);

		      stmt.close();
//		      c.commit();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Records created successfully");
	 }

	 public void select() {
		 try {
		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM Torte;" );
		      
//		      INSERT INTO Torte (id,name,pfad,beschr,kategorie_id, preis)
		      while ( rs.next() ) {
		         int id = rs.getInt("id");
		         String  name = rs.getString("name");
		         String  pfad = rs.getString("pfad");
		         String  beschr = rs.getString("beschr");
		         String  kategorie_id = rs.getString("kategorie_id");
		         float preis = rs.getFloat("preis");
		         System.out.println( "ID = " + id );
		         System.out.println( "NAME = " + name );
		         System.out.println( "PFAD = " + pfad );
		         System.out.println( "BESCHR = " + beschr );
		         System.out.println( "KATEGORIE_ID = " + kategorie_id );
		         System.out.println( "PREIS = " + preis );
		         System.out.println();
		      }
		      rs.close();
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Operation done successfully");
		  }
	 */
}
