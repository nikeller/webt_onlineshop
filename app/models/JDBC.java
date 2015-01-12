package models;

import java.sql.*;
import play.db.*;

public class JDBC {

	 public void createTable()
	  {
		     try {
		      Connection c = DB.getConnection();
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
								"bestand smallint NOT NULL" +
								")";
		      stmt.executeUpdate(strCreateTorte);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		   
		     System.out.println("If did not exist: Table Torte created successfully");
		  }
	  
	 public void insertInto(){
		 
		 try {
			  Connection c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();

		      String strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Olchi_torte', '/assets/images/Torte_001.jpg',"
		                   + "'Passend zum Kindergeburtstag', 'T', 35.50, 5);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
			 
		      stmt = c.createStatement();
		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Herzliche Grüße', '/assets/images/Torte_002.jpg',"
		                   + "'Leckere Torte für unsere Lieblinge', 'T', 33.0, 3);"; 
		      stmt.executeUpdate(strInsertIntoTorte);

		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Hochzeitstorte', '/assets/images/Torte_003.jpg',"
	                   + "'Dreistöckige Torte für besondere Anlässe', 'T', 70.50, 1);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Records(Torte) created successfully");
	 }
	 
	 
	 public void createTablePraline()
	  {
		     try {
		      Connection c = DB.getConnection();
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
								"bestand smallint NOT NULL" +
								")";
		      stmt.executeUpdate(strCreatePraline);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		   
		     System.out.println("If did not exist: Table Praline created successfully");
		  }
	 
	 public void createTableUser()
	  {
		     try {
		      Connection c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();
		      String strCreateUser =
		    		  "CREATE TABLE IF NOT EXISTS User (" +
								"email  VARCHAR(50) PRIMARY KEY, "	+
								"passwort VARCHAR(50) NOT NULL, " +
								"passwortWDH VARCHAR(50) NOT NULL, " +
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
		      System.exit(0);
		    }
		   
		     System.out.println("If did not exist: Table User created successfully");
		  }
	 
	 public void insertIntoUser(String email, String passwort, String passwortWDH,
				String vorname, String nachname, String adresse, String PLZ) {
			Connection c = null;
			Statement stmt = null;

			try {
				c = DB.getConnection();

				// Insert Student
				stmt = c.createStatement();
				String strInsertIntoUser = "INSERT INTO User (email, passwort, passwortWDH, vorname, nachname, adresse, PLZ) VALUES ('"
						+ email
						+ "','"
						+ passwort
						+ "','"
						+ passwortWDH
						+ "','"
						+ vorname
						+ "','" 
						+ nachname 
						+ "','" 
						+ adresse
						+ "','"
						+PLZ +"'"+
						")";
				
				System.out.println(strInsertIntoUser);
				stmt.executeUpdate(strInsertIntoUser);

				stmt.close();
				c.close();
			} catch (Exception e) {
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			System.out.println("Records created successfully");
		}
	  
	 public void insertIntoPraline(){
		 
		 try {
			  Connection c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();

		      String strInsertIntoTorte = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Pralinen', '/assets/images/Praline_001.jpg',"
		                   + "'Passend zum Kindergeburtstag', 'T', 35.50, 5);"; 
		      stmt.executeUpdate(strInsertIntoTorte);
			 
		      stmt = c.createStatement();
		      strInsertIntoTorte = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
		                   "VALUES ('Herzliche Grüße', '/assets/images/Praline_002.jpg',"
		                   + "'Leckere Torte für unsere Lieblinge', 'T', 33.0, 3);"; 
		      stmt.executeUpdate(strInsertIntoTorte);

		      strInsertIntoTorte = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
	                   "VALUES ('Pralinen', '/assets/images/Praline_003.jpg',"
	                   + "'Dreistöckige Torte für besondere Anlässe', 'T', 70.50, 1);"; 
		      stmt.executeUpdate(strInsertIntoTorte);

		      stmt.close();
//		      c.commit();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Records(Praline) created successfully");
	 }
	 
	 

	 public void select() {
		 try {
			  Connection c = DB.getConnection();
		      Statement stmt = null;
		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM Torte;" );
		      
//		      Schema: (id,name,pfad,beschr,kategorie_id, preis, bestand)
		      while ( rs.next() ) {
		         int id = rs.getInt("id");
		         String  name = rs.getString("name");
		         String  pfad = rs.getString("pfad");
		         String  beschr = rs.getString("beschr");
		         String  kategorie_id = rs.getString("kategorie_id");
		         float preis = rs.getFloat("preis");
		         int bestand =rs.getInt("bestand");
		         System.out.println( "ID = " + id );
		         System.out.println( "NAME = " + name );
		         System.out.println( "PFAD = " + pfad );
		         System.out.println( "BESCHR = " + beschr );
		         System.out.println( "KATEGORIE_ID = " + kategorie_id );
		         System.out.println( "PREIS = " + preis );
		         System.out.println( "LAGERBESTAND = " + bestand);
		         System.out.println(); 
		         System.out.println("Operation done successfully");
      
    
		      }
//		      ResultSet rs = stmt.executeQuery( "SELECT * FROM Search;" );
//		      while ( rs.next() ) {
//		         int idS = rs.getInt("id");
//		         String  nameS = rs.getString("name");
//		         System.out.println( "ID = " + idS );
//		         System.out.println( "NAME = " + nameS );
//		         System.out.println();
//			    System.out.println("Operation done successfully");
//			  }
		      rs.close();
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		 

	 
	 }
}
