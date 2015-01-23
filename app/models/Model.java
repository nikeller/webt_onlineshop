package models;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.Observable;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import play.db.DB;


public class Model extends Observable {

	public static final Model sharedInstance = new Model();

	public Model() {
		initDB();
		
	}

	public static ArrayList<Torte> torte = new ArrayList<Torte>();
	public static ArrayList<Praline> praline = new ArrayList<Praline>();
	public ArrayList<User> users = new ArrayList<User>();
	


	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Kategorie Torten				     	    //
	 /////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Torte> getTorten() {
		torte.clear();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = DB.getConnection();
			String torteInfoSQL = "SELECT * FROM Torte;";
			pstmt = connection.prepareStatement(torteInfoSQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Torte torten = new Torte(rs.getInt("id"), rs.getString("name"),
						rs.getString("beschr"), rs.getString("pfad"),
						rs.getString("kategorie_id"), rs.getInt("bestand"), rs.getFloat("preis"));

				torte.add(torten);

			}
		}catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
			}
		}
		return torte;

	}
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Kategorie Pralinen				     	    //
	 /////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Praline> getPralinen(){
		praline.clear();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection =DB.getConnection();
			String pralineInfoSQL = "SELECT * FROM Praline;";
			pstmt = connection.prepareStatement(pralineInfoSQL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Praline pralinen = new Praline(rs.getInt("id"), rs.getString("name"),
						rs.getString("beschr"), rs.getString("pfad"),
						rs.getString("kategorie_id"), rs.getInt("bestand"), rs.getFloat("preis"));

				praline.add(pralinen);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
			}
		}
		return praline;

	}



	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: RegistrierungP, AnmeldenP 			     	//
	 /////////////////////////////////////////////////////////////////////////////////

	public User getUser(String email){

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String getUserSQL = "SELECT * FROM User WHERE User.email = ?";
			connection =DB.getConnection();
			pstmt = connection.prepareStatement(getUserSQL);
			pstmt.setString(1,  email);
			rs = pstmt.executeQuery();
			User user = new User(rs.getString("email"),
					rs.getString("passwort"), rs.getString("vorname"),
					rs.getString("nachname"), rs.getString("adresse"),
					rs.getString("plz"));
			return user;
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
			}
		}
		return null;
		
	}

	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Bestellung, Warenkorb				     	//
	 /////////////////////////////////////////////////////////////////////////////////

	public ArrayList<WarenkorbM> getWarenkorb(String email){
		ArrayList<WarenkorbM > warenkorbL = new ArrayList<WarenkorbM>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if(warenkorbL!=null){
			for (int i=0;i<warenkorbL.size();i++){
				warenkorbL.remove(i);	
				}
		}
		String getWarenkorbSQL = "SELECT * FROM Warenkorb WHERE Warenkorb.email = ?";
		try {
			connection =DB.getConnection();
			pstmt = connection.prepareStatement(getWarenkorbSQL);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			while (rs.next()) {
			WarenkorbM WKM = new WarenkorbM(rs.getInt("id"), rs.getString("email"), rs.getString("ware"),
					rs.getDouble("preis"));
			warenkorbL.add(WKM);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
			}
		}
		return warenkorbL;
		
	}
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Bestellung			     				    //
	 /////////////////////////////////////////////////////////////////////////////////

	public void WarenkorbL(String email) {
		Connection connection = null;
		PreparedStatement pstmt = null;
	
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		Statement stmt5 = null;
		Statement stmt6 = null;

		ResultSet rs = null;
		ResultSet produkt_id_torte = null;
		ResultSet produkt_id_praline = null;
		
		int anzahlUpdateT=0;
		int anzahlUpdateP=0;
		short eins = -1;
		try {	
			connection = DB.getConnection();
			String getProduktNamen = "SELECT * FROM Warenkorb WHERE email = '"
					+ email + "'";
			
			pstmt = connection.prepareStatement(getProduktNamen);
			rs = pstmt.executeQuery();
			
	
			while(rs.next()){
				
			String Name = rs.getString("ware");
			
			String getKategorieIDT = "SELECT id FROM Torte WHERE name = '"
					+ Name + "'";
			String getKategorieIDP = "SELECT id FROM Praline WHERE name = '"
					+ Name + "'";
			
			stmt2 = connection.createStatement();
			produkt_id_torte = stmt2.executeQuery(getKategorieIDT);

			
			stmt3 = connection.createStatement();
			produkt_id_praline = stmt3.executeQuery(getKategorieIDP);

			
			if(produkt_id_torte != null){
				while(produkt_id_torte.next()){
					System.out.println("übergebene E-Mail: "+email);
					stmt4 = connection.createStatement();
					String UpdateStringT = "UPDATE Torte SET bestand = bestand" + eins
											+ " WHERE id = '" + produkt_id_torte.getInt("id") +"';";
					
					anzahlUpdateT = stmt4.executeUpdate(UpdateStringT);	



//					if (countObservers() > 0) {
//						setChanged();
//						notifyObservers(produkt_id_torte.getString("name"));
//						}
				
				
					}
			}
			
			
			
			if(produkt_id_praline != null){
				while(produkt_id_praline.next()){
					System.out.println("übergebene E-Mail: "+email);
					stmt5 = connection.createStatement();
					String UpdateStringP = "UPDATE Praline SET bestand = bestand" + eins
											+ " WHERE id = '" + produkt_id_praline.getInt("id") +"';";
					
					anzahlUpdateP = stmt5.executeUpdate(UpdateStringP);	



//					if (countObservers() > 0) {
//						setChanged();
//						notifyObservers(produkt_id_praline.getString("name"));
//						}
				}
			}
			System.out.println("--------If did not exist: Table created successfully");}

			String strWarenkorbL = "DELETE" + " FROM Warenkorb"
					+ " WHERE email = '" + email + "';";
			
			stmt6 = connection.createStatement();
			stmt6.executeUpdate(strWarenkorbL);
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (produkt_id_torte != null) {
				try {
					produkt_id_torte.close();
				} catch (SQLException e) {
				}
			}
			if (produkt_id_praline != null) {
				try {
					produkt_id_praline.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (stmt2 != null) {try {stmt2.close();} catch (SQLException e) {}}
			if (stmt3 != null) {try {stmt3.close();} catch (SQLException e) {}}
			if (stmt4 != null) {try {stmt4.close();} catch (SQLException e) {}}
			if (stmt5 != null) {try {stmt5.close();} catch (SQLException e) {}}
			if (stmt6 != null) {try {stmt6.close();} catch (SQLException e) {}}
			
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
			}
		}
		
		
		System.out.println("If did not exist: Table deleted");
	}

	
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Observer			     				    //
	 /////////////////////////////////////////////////////////////////////////////////
//	public static JsonNode zeigeAktuelleMenge(JsonNode obj) {
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		JsonNode jsonMenge = null;
//		String name = obj.get("name").asText();
//		Integer menge = null;
//		System.out.println("Init done ");
//		try {
//			System.out.println("in try ");
//			connection = DB.getConnection();
//			stmt = connection.createStatement();
//			rs = stmt
//					.executeQuery("SELECT * FROM Torte, Praline WHERE name = '"
//							+ name + "' ;");
//
//			if (rs.next()) {
//				menge = new Integer(rs.getInt("bestand"));
//				System.out.println("in rs next");
//			}
//
//			ObjectMapper mapper = new ObjectMapper();
//			jsonMenge = mapper.readTree("{\"name\":\"" + name
//					+ "\",\"Menge\":\"" + menge.toString() + "\"}");
//			System.out.println("JSON-Menge: " + jsonMenge);
//
//		} catch (SQLException | IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//				}
//			}
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException e) {
//				}
//			}
//
//		}
//
//		return jsonMenge;
//	}

	
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: beim Registrieren						    //
	 /////////////////////////////////////////////////////////////////////////////////
	 public void insertIntoUser(String email, String passwort,
			String vorname, String nachname, String adresse, String PLZ){
			Statement stmt = null;
			Connection connection = null;

			try {
				connection = DB.getConnection();

				// Insert Student
				stmt = connection.createStatement();
				String strInsertIntoUser = "INSERT INTO User (email, passwort, vorname, nachname, adresse, PLZ) VALUES ('"
						+ email
						+ "','"
						+ passwort
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
				System.out.println("InsertIntoUser fertig___________________________________");
			}  catch (SQLException e) {

				e.printStackTrace();
			} finally {
			
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
					}
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
					}
				}
			}
			System.out.println("Records created successfully");
		}
	  
	 
	/////////////////////////////////////////////////////////////////////////////////
	//				Application Aufruf: beim Click in den Warenkorb				  //
	////////////////////////////////////////////////////////////////////////////////
	 public void insertIntoWarenkorb(String email, String ware,
				double preis){
			Statement stmt = null;
			Connection connection = null;
			try {
				connection = DB.getConnection();

				stmt = connection.createStatement();
				String strInsertIntoWarenkorb = "INSERT INTO Warenkorb (email, ware, preis) VALUES ('"
						+ email
						+ "','"
						+ ware
						+ "','" 
						+preis +"'"+
						")";
				
				System.out.println(strInsertIntoWarenkorb);
				stmt.executeUpdate(strInsertIntoWarenkorb);
				stmt.close();
				System.out.println("InsertInToWarenkorb fertig-----------------------------");
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
			
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
					}
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
					}
				}
			}
			System.out.println("Records created successfully");
		}
	
	
	public void initDB()
	{
		Statement stmt = null;
		Connection connection = null;
		 try {
			 
			 
			  connection = DB.getConnection();  
		      stmt = connection.createStatement();
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
	      
//		      String strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                   "VALUES ('Goldene Freude', '/assets/images/Torte_001.jpg',"
//	                   + "'Hochzeitstorte', 'T', 35.50, 30);"; 
//		      stmt.executeUpdate(strInsertIntoTorte);
//			 
//		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
//		                   "VALUES ('Himmlische Torte', '/assets/images/Torte_002.jpg',"
//		                   + "'Passend zur Hochzeit, Geburtstag', 'T', 33.0, 36);"; 
//		      stmt.executeUpdate(strInsertIntoTorte);
//	
//		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                  "VALUES ('Hochzeitstorte', '/assets/images/Torte_003.jpg',"
//	                  + "'Dreistöckige Torte für besondere Anlässe', 'T', 70.50, 53);"; 
//		      stmt.executeUpdate(strInsertIntoTorte);
//		      
//		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                  "VALUES ('Nusstorte', '/assets/images/Torte_004.jpg',"
//	                  + "'Zum Frühstück oder Geburtstag', 'T', 10.00, 50);"; 
//		      stmt.executeUpdate(strInsertIntoTorte);
//		      
//		      strInsertIntoTorte = "INSERT INTO Torte (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                  "VALUES ('Wuff-Wuff', '/assets/images/Torte_005.jpg',"
//	                  + "'Passend zum Kindergeburtstag', 'T', 25.00, 42);"; 
//		      stmt.executeUpdate(strInsertIntoTorte);
		      
		      
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
		      
//		      String strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
//		                   "VALUES ('Pralinen aus Milchschokolade', '/assets/images/Praline_001.jpg',"
//		                   + "'Für unsere Lieblinge', 'P', 10.00, 50);"; 
//		      stmt.executeUpdate(strInsertIntoPraline);
//			 
//		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
//		                   "VALUES ('Marmorpralinen', '/assets/images/Praline_002.jpg',"
//		                   + "'Für unsere Lieblinge', 'P', 8.00, 30);"; 
//		      stmt.executeUpdate(strInsertIntoPraline);
//
//		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                   "VALUES ('Pralinen aus weisser Schokolade', '/assets/images/Praline_003.jpg',"
//	                   + "'Für unsere Lieblinge', 'P', 9.00, 10);"; 
//		      stmt.executeUpdate(strInsertIntoPraline);
//		      
//		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                   "VALUES ('Pralinen-Assorti', '/assets/images/Praline_004.jpg',"
//	                   + "'Für unsere Lieblinge', 'P', 12.50, 10);"; 
//		      stmt.executeUpdate(strInsertIntoPraline);
//		      
//		      strInsertIntoPraline = "INSERT INTO Praline (name, pfad, beschr, kategorie_id, preis, bestand) " +
//	                   "VALUES ('Assorti', '/assets/images/Praline_005.jpg',"
//	                   + "'Für unsere Lieblinge', 'P', 11.00, 10);"; 
//		      stmt.executeUpdate(strInsertIntoPraline);
		      
		      String strCreateWarenkorb =
		    		  "CREATE TABLE IF NOT EXISTS Warenkorb (" +
		    				  	"id  INTEGER PRIMARY KEY AUTOINCREMENT,"	+
								"email VARCHAR(100) NOT NULL, " +
								"ware  VARCHAR(100) NOT NULL," +
								"preis decimal(4,2) NOT NULL" +
								")";
		      stmt.executeUpdate(strCreateWarenkorb);
		      
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
		    } catch (SQLException e) {

				e.printStackTrace();
			} finally {
			
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
					}
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
					}
				}
			}
		    System.out.println("Records created successfully");
	 }
	 
	

}