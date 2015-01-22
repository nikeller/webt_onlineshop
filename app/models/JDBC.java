package models;

import java.sql.*;

import play.db.*;

public class JDBC {
	/////////////////////////////////////////////////////////////////////////////////
	//				Application Aufruf: erstellen der Tabelle (1 malig)			   //
	/////////////////////////////////////////////////////////////////////////////////
	 public void createTable() throws SQLException
	  {
		 Connection c = null;
		     try {
		      c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();
		      String strCreateTorte =
		    		  "CREATE TABLE IF NOT EXISTS Torte (" +
								"id  INTEGER PRIMARY KEY AUTOINCREMENT,"	+
								"name VARCHAR(50) NOT NULL, " +
								"pfad  VARCHAR(100) NOT NULL," +
								"beschr VARCHAR(150)," +
								"kategorie_id VARCHAR(10) NOT NULL," +
								"preis decimal(4,2) NOT NULL," +
								"bestand Integer NOT NULL" +
								")";
		      stmt.executeUpdate(strCreateTorte);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      c.close();
		    }
		   
		     System.out.println("If did not exist: Table Torte created successfully");
		  }
	/////////////////////////////////////////////////////////////////////////////////
	//				Application Aufruf: einfügen in die Tabelle (1 malig)		   //
	/////////////////////////////////////////////////////////////////////////////////
	 public void insertInto() throws SQLException{
		 Connection c = null;
		 try {
			  c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();

		      String strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Goldene Freude', '/assets/images/Torte_001.jpg',"
		                   + "'Hochzeitstorte', 'T', 35.50, 30);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
			 
		      stmt = c.createStatement();
		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Himmlische Torte', '/assets/images/Torte_002.jpg',"
		                   + "'Passend zur Hochzeit, Geburtstag', 'T', 33.0, 36);"; 
		      stmt.executeUpdate(strInsertIntoTorte);

		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Hochzeitstorte', '/assets/images/Torte_003.jpg',"
	                   + "'Dreistöckige Torte für besondere Anlässe', 'T', 70.50, 53);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
		      
		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Nusstorte', '/assets/images/Torte_004.jpg',"
	                   + "'Zum Frühstück oder Geburtstag', 'T', 10.00, 50);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
		      
		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Wuff-Wuff', '/assets/images/Torte_005.jpg',"
	                   + "'Passend zum Kindergeburtstag', 'T', 25.00, 42);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
		      
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      c.close();
		    }
		    System.out.println("Records(Torte) created successfully");
	 }
	 
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: einfügen in die Tabelle (1 malig)		    //
	 ///////////////////////////////////////////////////////////////////////////////// 
	 
	 public void createTablePraline() throws SQLException
	  {
		 Connection c = null;
		     try {
		      c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();
		      String strCreatePraline =
		    		  "CREATE TABLE IF NOT EXISTS Praline (" +
								"id  INTEGER PRIMARY KEY AUTOINCREMENT,"	+
								"name VARCHAR(50) NOT NULL, " +
								"pfad  VARCHAR(100) NOT NULL," +
								"beschr VARCHAR(150)," +
								"kategorie_id VARCHAR(10) NOT NULL," +
								"preis decimal(4,2) NOT NULL," +
								"bestand INTEGER NOT NULL" +
								")";
		      stmt.executeUpdate(strCreatePraline);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      c.close();
		    }
		   
		     System.out.println("If did not exist: Table Praline created successfully");
		  }
	/////////////////////////////////////////////////////////////////////////////////
	//				Application Aufruf: einfügen in die Tabelle (1 malig)		   //
	/////////////////////////////////////////////////////////////////////////////////
	 public void insertIntoPraline() throws SQLException{
		 Connection c = null;
		 try {
			 
			  c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();

		      String strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Pralinen aus Milchschokolade', '/assets/images/Praline_001.jpg',"
		                   + "'Für unsere Lieblinge', 'P', 10.00, 50);"; 
		      stmt.executeUpdate(strInsertIntoPraline);
			 
		      stmt = c.createStatement();
		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Marmorpralinen', '/assets/images/Praline_002.jpg',"
		                   + "'Für unsere Lieblinge', 'P', 8.00, 30);"; 
		      stmt.executeUpdate(strInsertIntoPraline);

		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Pralinen aus weisser Schokolade', '/assets/images/Praline_003.jpg',"
	                   + "'Für unsere Lieblinge', 'P', 9.00, 10);"; 
		      stmt.executeUpdate(strInsertIntoPraline);
		      
		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Pralinen-Assorti', '/assets/images/Praline_004.jpg',"
	                   + "'Für unsere Lieblinge', 'P', 12.50, 10);"; 
		      stmt.executeUpdate(strInsertIntoPraline);
		      
		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Assorti', '/assets/images/Praline_005.jpg',"
	                   + "'Für unsere Lieblinge', 'P', 11.00, 10);"; 
		      stmt.executeUpdate(strInsertIntoPraline);

		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      c.close();
		    }
		    System.out.println("Records(Praline) created successfully");
	 }
	 
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: einfügen in die Tabelle (1 malig)		    //
	 /////////////////////////////////////////////////////////////////////////////////
	 public void createTableUser() throws SQLException
	  {
		 Connection c = null;
		     try {
		      c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();
		      String strCreateUser =
		    		  "CREATE TABLE IF NOT EXISTS User (" +
								"email  VARCHAR(50) PRIMARY KEY, "	+
								"passwort VARCHAR(50) NOT NULL, " +
								"vorname VARCHAR(50) NOT NULL, " +
								"nachname VARCHAR(50) NOT NULL, " +
								"adresse  VARCHAR(100) NOT NULL," +
								"PLZ INTEGER NOT NULL" +
								")";
		      stmt.executeUpdate(strCreateUser);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      c.close();
		    }
		   
		     System.out.println("If did not exist: Table User created successfully");
		  }
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: einfügen in die Tabelle (1 malig)		    //
	 /////////////////////////////////////////////////////////////////////////////////
	 public void createTableWarenkorb() throws SQLException
	  {
		 Connection c = null;
		     try {
		      c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();
		      String strCreateWarenkorb =
		    		  "CREATE TABLE IF NOT EXISTS Warenkorb (" +
		    				  	"id  INTEGER PRIMARY KEY AUTOINCREMENT,"	+
								"email VARCHAR(100) NOT NULL, " +
								"ware  VARCHAR(100) NOT NULL," +
								"preis decimal(4,2) NOT NULL" +
								")";
		      stmt.executeUpdate(strCreateWarenkorb);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );		   
		      c.close();
		    }
		   
		     System.out.println("If did not exist: Table Warenkorb created successfully");
		  }
	 

	 
}
