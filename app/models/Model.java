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

	public static ArrayList<Torte> torte = new ArrayList<Torte>();
	public static ArrayList<Praline> praline = new ArrayList<Praline>();
	public static ArrayList<Gebaeck> gebaeck = new ArrayList<Gebaeck>();
	



	public ArrayList<Torte> getTorten() throws SQLException {
		Connection connection = null;
		torte.clear();
		try {
			connection =DB.getConnection();
			String torteInfoSQL = "SELECT * FROM Torte;";
			PreparedStatement pstmt = connection.prepareStatement(torteInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Torte torten = new Torte(rs.getInt("id"), rs.getString("name"),
						rs.getString("beschr"), rs.getString("pfad"),
						rs.getString("kategorie_id"), rs.getInt("bestand"), rs.getFloat("preis"));

				torte.add(torten);

			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			connection.close();
		}
		connection.close();
		return torte;

	}

	public ArrayList<Praline> getPralinen() throws SQLException {
		Connection connection = null;
		praline.clear();
		try {
			connection =DB.getConnection();
			String pralineInfoSQL = "SELECT * FROM Praline;";
			PreparedStatement pstmt = connection.prepareStatement(pralineInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Praline pralinen = new Praline(rs.getInt("id"), rs.getString("name"),
						rs.getString("beschr"), rs.getString("pfad"),
						rs.getString("kategorie_id"), rs.getInt("bestand"), rs.getFloat("preis"));

				praline.add(pralinen);

			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		connection.close();
		return praline;

	}
	
	public ArrayList<Gebaeck> getGebaeck() throws SQLException {
		Connection connection = null;
		gebaeck.clear();
		try {
			connection =DB.getConnection();
			String gebaeckInfoSQL = "SELECT * FROM Gebaeck;";
			PreparedStatement pstmt = connection.prepareStatement(gebaeckInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Gebaeck gebaecken = new Gebaeck(rs.getInt("id"), rs.getString("name"),
						rs.getString("pfad"), rs.getString("beschr"),
						rs.getString("kategorie_id"), rs.getFloat("preis"));

				gebaeck.add(gebaecken);

			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		connection.close();
		return gebaeck;
	}


	public ArrayList<User> users = new ArrayList<User>();
	

	public User getUser(String email) throws SQLException {
		Connection connection = null;
		String getUserSQL = "SELECT * FROM User WHERE User.email = '"
				+ email + "'";
		try {
			connection =DB.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(getUserSQL);
			ResultSet rs = pstmt.executeQuery();
			User user = new User(rs.getString("email"),
					rs.getString("passwort"), rs.getString("vorname"),
					rs.getString("nachname"), rs.getString("adresse"),
					rs.getString("plz"));
			return user;
		} catch (SQLException e) {
			System.out.println("User mit EMail " + email + " nicht gefunden!");
			e.printStackTrace();
		
		}
		connection.close();
		return null;
		
	}

	
	public ArrayList<WarenkorbM> getWarenkorb(String email) throws SQLException {
		Connection connection = null;
		ArrayList<WarenkorbM > warenkorbL = new ArrayList<WarenkorbM>();
		for (int i=0;i<warenkorbL.size();i++){
			warenkorbL.remove(i);	
			}
		String getWarenkorbSQL = "SELECT * FROM Warenkorb WHERE Warenkorb.email = '"
				+ email + "'";
		try {
			connection =DB.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(getWarenkorbSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
			WarenkorbM WKM = new WarenkorbM(rs.getInt("id"), rs.getString("email"), rs.getString("ware"),
					rs.getDouble("preis"));
			warenkorbL.add(WKM);
			}
		} catch (SQLException e) {
			System.out.println("User mit EMail " + email + " nicht gefunden!");
			e.printStackTrace();
		
		}
		connection.close();
		return warenkorbL;
		
	}
	
	public void WarenkorbL(String email) {
		Connection c = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		Statement stmt5 = null;
		Statement stmt6 = null;
		int anzahlUpdateT=0;
		int anzahlUpdateP=0;
		short eins = -1;
		System.out.println("alles angelegt");
		try {	
			c = DB.getConnection();
			String getProduktNamen = "SELECT * FROM Warenkorb WHERE email = '"
					+ email + "'";
			
			PreparedStatement pstmt = c.prepareStatement(getProduktNamen);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("aus DB gelesen: ware aus Warenkorb: "+ rs);
			while(rs.next()){
				
			String Name = rs.getString("ware");
			
			String getKategorieIDT = "SELECT id FROM Torte WHERE name = '"
					+ Name + "'";
			String getKategorieIDP = "SELECT id FROM Praline WHERE name = '"
					+ Name + "'";
			
			stmt2 = c.createStatement();
			ResultSet produkt_id_torte = stmt2.executeQuery(getKategorieIDT);
			System.out.println("aus Torten gelesen: "+ produkt_id_torte);
			
			stmt3 = c.createStatement();
			ResultSet produkt_id_praline = stmt3.executeQuery(getKategorieIDP);
			System.out.println("aus Pralinen gelesen: "+ produkt_id_praline);
			
			if(produkt_id_torte != null){
				
			
				while(produkt_id_torte.next()){
				
					stmt4 = c.createStatement();
					String UpdateStringT = "UPDATE Torte SET bestand = bestand" + eins
											+ " WHERE id = '" + produkt_id_torte.getInt("id") +"';";
					
					anzahlUpdateT = stmt4.executeUpdate(UpdateStringT);	
			
					System.out.println(" ArtikelNummer "
							+ produkt_id_torte.getInt("id") + " bestellt...");
				
				
					if (countObservers() > 0) {
						setChanged();
						notifyObservers(produkt_id_torte.getInt("id"));
						}
				
				
					}
			}
			
			
			
			if(produkt_id_praline != null){
			while(produkt_id_praline.next()){
				stmt5 = c.createStatement();
				String UpdateStringP = "UPDATE Praline SET bestand = bestand" + eins
										+ " WHERE id = '" + produkt_id_praline.getInt("id") +"';";
				
				anzahlUpdateP = stmt5.executeUpdate(UpdateStringP);	
				
				System.out.println(" ArtikelNummer "
						+ produkt_id_praline.getInt("id") + " bestellt...");
				
				if (countObservers() > 0) {
					setChanged();
					notifyObservers(produkt_id_praline.getInt("id"));	
					}
				
				}
			}
			System.out.println("--------If did not exist: Table created successfully");}

			String strWarenkorbL = "DELETE" + " FROM Warenkorb"
					+ " WHERE email = '" + email + "';";
			System.out.println(strWarenkorbL);
			
			stmt6 = c.createStatement();
			stmt6.executeUpdate(strWarenkorbL);
			stmt6.close();
			c.close();
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		
		System.out.println("If did not exist: Table deleted");
	}




public Integer[] BestandAktuell(int produkt_id) throws SQLException {
	
	Connection connection = null;
	Integer bestandT = null;
	Integer bestandP = null;
	Integer[] Parameter = new Integer[2];
	
	String waehlenT = "SELECT * FROM Torte WHERE produkt_id = '"
			+ produkt_id + "'";;
			
	String waehlenP = "SELECT * FROM Praline WHERE produkt_id = '"
					+ produkt_id + "'";;
	try {
			connection = DB.getConnection();
			PreparedStatement pstmt1 = connection.prepareStatement(waehlenT);
			ResultSet rs1 = pstmt1.executeQuery();
			if (rs1.next()) {
				bestandT = new Integer(rs1.getInt("bestand"));
			}
			
			PreparedStatement pstmt2 = connection.prepareStatement(waehlenP);
			ResultSet rs2 = pstmt2.executeQuery();
			if (rs2.next()) {
				bestandP = new Integer(rs2.getInt("bestand"));
			}
			Parameter[0]=bestandT;
			Parameter[1]=bestandP;
		}

	catch (Exception e) {
	System.err.println(e.getClass().getName() + ": " + e.getMessage());
	}
	connection.close();
	return Parameter;
	}
}