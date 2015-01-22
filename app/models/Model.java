package models;


import java.awt.Font;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.text.*;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import play.db.DB;
import controllers.Assets;

public class Model extends Observable {

	public static final Model sharedInstance = new Model();

	public Model() {
		
	}
	private static Connection connection = DB.getConnection();
	public static ArrayList<Torte> torte = new ArrayList<Torte>();
	public static ArrayList<Praline> praline = new ArrayList<Praline>();
	public ArrayList<User> users = new ArrayList<User>();
	


	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Kategorie Torten				     	    //
	 /////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Torte> getTorten() {
		torte.clear();
		PreparedStatement pstmt = null;
		try {
			connection = DB.getConnection();
			String torteInfoSQL = "SELECT * FROM Torte;";
			pstmt = connection.prepareStatement(torteInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Torte torten = new Torte(rs.getInt("id"), rs.getString("name"),
						rs.getString("beschr"), rs.getString("pfad"),
						rs.getString("kategorie_id"), rs.getInt("bestand"), rs.getFloat("preis"));

				torte.add(torten);

			}
		}catch (SQLException e) {
			System.out.println("Fehler beim Aufruf getTorten");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return torte;

	}
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Kategorie Pralinen				     	    //
	 /////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Praline> getPralinen(){
		praline.clear();
		PreparedStatement pstmt = null;
		try {
			connection =DB.getConnection();
			String pralineInfoSQL = "SELECT * FROM Praline;";
			pstmt = connection.prepareStatement(pralineInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Praline pralinen = new Praline(rs.getInt("id"), rs.getString("name"),
						rs.getString("beschr"), rs.getString("pfad"),
						rs.getString("kategorie_id"), rs.getInt("bestand"), rs.getFloat("preis"));

				praline.add(pralinen);

			}
		} catch (SQLException e) {
			System.out.println("Fehler beim Aufruf getPralinen");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return praline;

	}



	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: RegistrierungP, AnmeldenP 			     	//
	 /////////////////////////////////////////////////////////////////////////////////

	public User getUser(String email){
		String getUserSQL = "SELECT * FROM User WHERE User.email = '"
				+ email + "'";
		PreparedStatement pstmt = null;
		try {
			connection =DB.getConnection();
			pstmt = connection.prepareStatement(getUserSQL);
			ResultSet rs = pstmt.executeQuery();
			User user = new User(rs.getString("email"),
					rs.getString("passwort"), rs.getString("vorname"),
					rs.getString("nachname"), rs.getString("adresse"),
					rs.getString("plz"));
			return user;
		} catch (SQLException e) {
			System.out.println("Fehler beim Aufruf getUser");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return null;
		
	}

	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Bestellung, Warenkorb				     	//
	 /////////////////////////////////////////////////////////////////////////////////

	public ArrayList<WarenkorbM> getWarenkorb(String email){
		ArrayList<WarenkorbM > warenkorbL = new ArrayList<WarenkorbM>();
		PreparedStatement pstmt = null;
		for (int i=0;i<warenkorbL.size();i++){
			warenkorbL.remove(i);	
			}
		String getWarenkorbSQL = "SELECT * FROM Warenkorb WHERE Warenkorb.email = '"
				+ email + "'";
		try {
			connection =DB.getConnection();
			pstmt = connection.prepareStatement(getWarenkorbSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
			WarenkorbM WKM = new WarenkorbM(rs.getInt("id"), rs.getString("email"), rs.getString("ware"),
					rs.getDouble("preis"));
			warenkorbL.add(WKM);
			}
		} catch (SQLException e) {
			System.out.println("Fehler beim Aufruf getWarenkorb");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return warenkorbL;
		
	}
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Bestellung			     				    //
	 /////////////////////////////////////////////////////////////////////////////////

	public void WarenkorbL(String email) {
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		Statement stmt5 = null;
		Statement stmt6 = null;
		int anzahlUpdateT=0;
		int anzahlUpdateP=0;
		short eins = -1;
	
		try {	
			connection = DB.getConnection();
			String getProduktNamen = "SELECT * FROM Warenkorb WHERE email = '"
					+ email + "'";
			
			PreparedStatement pstmt = connection.prepareStatement(getProduktNamen);
			ResultSet rs = pstmt.executeQuery();
			
	
			while(rs.next()){
				
			String Name = rs.getString("ware");
			
			String getKategorieIDT = "SELECT id FROM Torte WHERE name = '"
					+ Name + "'";
			String getKategorieIDP = "SELECT id FROM Praline WHERE name = '"
					+ Name + "'";
			
			stmt2 = connection.createStatement();
			ResultSet produkt_id_torte = stmt2.executeQuery(getKategorieIDT);

			
			stmt3 = connection.createStatement();
			ResultSet produkt_id_praline = stmt3.executeQuery(getKategorieIDP);

			
			if(produkt_id_torte != null){
				while(produkt_id_torte.next()){
					System.out.println("übergebene E-Mail: "+email);
					stmt4 = connection.createStatement();
					String UpdateStringT = "UPDATE Torte SET bestand = bestand" + eins
											+ " WHERE id = '" + produkt_id_torte.getInt("id") +"';";
					
					anzahlUpdateT = stmt4.executeUpdate(UpdateStringT);	

					int observertestt = countObservers();
					System.out.println("Anzahl Observer="+observertestt);

					if (countObservers() > 0) {
						setChanged();
						notifyObservers(produkt_id_torte.getString("name"));
						}
				
				
					}
			}
			
			
			
			if(produkt_id_praline != null){
				while(produkt_id_praline.next()){
					System.out.println("übergebene E-Mail: "+email);
					stmt5 = connection.createStatement();
					String UpdateStringP = "UPDATE Praline SET bestand = bestand" + eins
											+ " WHERE id = '" + produkt_id_praline.getInt("id") +"';";
					
					anzahlUpdateP = stmt5.executeUpdate(UpdateStringP);	

					int observertestp = countObservers();
					System.out.println("Anzahl Observer="+observertestp);

					if (countObservers() > 0) {
						setChanged();
						notifyObservers(produkt_id_praline.getString("name"));
						}
				}
			}
			System.out.println("--------If did not exist: Table created successfully");}

			String strWarenkorbL = "DELETE" + " FROM Warenkorb"
					+ " WHERE email = '" + email + "';";
			
			stmt6 = connection.createStatement();
			stmt6.executeUpdate(strWarenkorbL);
			
		} catch (SQLException e) {
			System.out.println("Fehler beim Aufruf WarenkorbL");
			e.printStackTrace();
		} finally {
			try {
				
					stmt2.close();
					
				
					stmt3.close();
					
				
				if(stmt4!=null){
					stmt4.close();
					}
				if(stmt5!=null){
					stmt5.close();
					}
				stmt6.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
		System.out.println("If did not exist: Table deleted");
	}

	
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: Observer			     				    //
	 /////////////////////////////////////////////////////////////////////////////////
	public static JsonNode zeigeAktuelleMenge(JsonNode obj) {
		Statement stmt = null;
		ResultSet rs = null;

		JsonNode jsonMenge = null;
		String name = obj.get("name").asText();
		Integer menge = null;
		System.out.println("Init done ");
		try {
			System.out.println("in try ");
			connection = DB.getConnection();
			stmt = connection.createStatement();
			rs = stmt
					.executeQuery("SELECT * FROM Torte, Praline WHERE name = '"
							+ name + "' ;");

			if (rs.next()) {
				menge = new Integer(rs.getInt("bestand"));
				System.out.println("in rs next");
			}

			ObjectMapper mapper = new ObjectMapper();
			jsonMenge = mapper.readTree("{\"name\":\"" + name
					+ "\",\"Menge\":\"" + menge.toString() + "\"}");
			System.out.println("JSON-Menge: " + jsonMenge);

		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
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

		return jsonMenge;
	}

	
	 /////////////////////////////////////////////////////////////////////////////////
	 //				Application Aufruf: beim Registrieren						    //
	 /////////////////////////////////////////////////////////////////////////////////
	 public void insertIntoUser(String email, String passwort,
			String vorname, String nachname, String adresse, String PLZ){
			Statement stmt = null;

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
				System.out.println("Fehler beim Aufruf getWarenkorb");
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
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

			try {
				connection = DB.getConnection();

				// Insert Student
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
				connection.close();
				System.out.println("InsertInToWarenkorb fertig-----------------------------");
			} catch (SQLException e) {
				System.out.println("Fehler beim Aufruf getWarenkorb");
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Records created successfully");
		}
	
	
	
	
	

}