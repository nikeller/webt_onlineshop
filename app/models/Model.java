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
	

	private static Connection connection = DB.getConnection();

	public ArrayList<Torte> getTorten() {
		torte.clear();
		try {
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
			System.exit(0);
		}
		return torte;

	}

	public ArrayList<Praline> getPralinen() {
		praline.clear();
		try {
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
			System.exit(0);
		}
		return praline;

	}
	
	public ArrayList<Gebaeck> getGebaeck() {
		gebaeck.clear();
		try {
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
			System.exit(0);
		}
		return gebaeck;
	}


	public ArrayList<User> users = new ArrayList<User>();
	

	public User getUser(String email) {
		String getUserSQL = "SELECT * FROM User WHERE User.email = '"
				+ email + "'";
		try {
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
		return null;
		
	}

	
	public ArrayList<WarenkorbM> getWarenkorb(String email) {
		ArrayList<WarenkorbM > warenkorbL = new ArrayList<WarenkorbM>();
		System.out.println("????????"+warenkorbL.size());
		for (int i=0;i<warenkorbL.size();i++){
			warenkorbL.remove(i);	
			}
		System.out.println("????????"+warenkorbL.size());
		String getWarenkorbSQL = "SELECT * FROM Warenkorb WHERE Warenkorb.email = '"
				+ email + "'";
		try {
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
		return warenkorbL;
		
	}
//public WarenkorbM deleteWk() throws SQLException
//{
//	String delete = "DELETE FROM Warenkorb";
//	PreparedStatement pstmt = connection.prepareStatement(delete);
//	return null;
//}
	
	
//	public void warenkorbLeeren(String email) throws SQLException {
//		System.out.println("------------------" +email);
//		Connection conn = null;
//		Statement stmt = conn.createStatement();
//		ResultSet rs = null;
//
//		String sql = "DELETE FROM Warenkorb WHERE email = z@z.z";
//		stmt.executeUpdate(sql);
//		System.out.println("DELETE-------------");
		
//		try {
//			conn = DB.getConnection();
//			stmt = conn.createStatement();
//
//			int anzahl = stmt
//					.executeUpdate("DELETE FROM Warenkorb WHERE Warenkorb.email = '"
//							+ email + "';");
//
//			if (anzahl == 1) {
//				System.out.println(anzahl
//						+ " Eintrag aus Warenkorb geloescht");
//
//			} else {
//				System.out.println(anzahl
//						+ " Eintraege aus Warenkorb geloescht");
//			}
//		} catch (SQLException e) {
//			System.out.println("Fehler beim aendern der Menge");
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
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//				}
//			}
//		}
//	}
	
//	public void deleteW(String email){
////		Statement stmt = null;
//		try{
//		
////			stmt=connection.createStatement();
//			String sqlW = "DELETE FROM Warenkorb";
//			PreparedStatement pstmtW = connection.prepareStatement(sqlW);
////			stmt.executeUpdate(sqlW);
//			System.out.println("DELETE");
//		}catch(SQLException se){
//			se.printStackTrace();
//			System.out.println("----------1. catch");
//		}
//		
//	}
	
	public void WarenkorbL(String email) {
		Connection c = null;
		Statement stmt1 = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		Statement stmt5 = null;
		Statement stmt6 = null;
		int anzahlUpdateT=0;
		int anzahlUpdateP=0;
		short eins = -1;
		try {	
			c = DB.getConnection();
			stmt1 = c.createStatement();
			stmt2 = c.createStatement();
			stmt3 = c.createStatement();
			stmt4 = c.createStatement();
			stmt5 = c.createStatement();
			stmt6 = c.createStatement();
			
			String getProduktNamen = "SELECT ware FROM Warenkorb WHERE email = '"
					+ email + "'";

			ResultSet rs = stmt1.executeQuery(getProduktNamen);
			while(rs.next()){
			String Name = rs.getString("ware");
			
			String getKategorieIDT = "SELECT id FROM Torte WHERE name = '"
					+ Name + "'";
			
			String getKategorieIDP = "SELECT id FROM Praline WHERE name = '"
					+ Name + "'";
			
			ResultSet produkt_id_torte = stmt2.executeQuery(getKategorieIDT);
			ResultSet produkt_id_praline = stmt3.executeQuery(getKategorieIDP);
			if(produkt_id_torte != null){
			while(produkt_id_torte.next()){

				String UpdateStringT = "UPDATE Torte SET bestand = bestand" + eins
										+ " WHERE id = '" + produkt_id_torte.getInt("id") +"';";
				anzahlUpdateT = stmt4.executeUpdate(UpdateStringT);	
				System.out.println("&&&&&&&&&&&&&&&&&&T"+produkt_id_torte.getInt("id")+"  "+ UpdateStringT);

				}
			}
			if(produkt_id_torte != null){
			while(produkt_id_praline.next()){
				String UpdateStringP = "UPDATE Torte SET bestand = bestand" + eins
										+ " WHERE id = '" + produkt_id_praline.getInt("id") +"';";
				anzahlUpdateP = stmt5.executeUpdate(UpdateStringP);
				System.out.println("&&&&&&&&&&&&&&&&&&P"+produkt_id_praline.getInt("id")+"  "+ UpdateStringP);
				}	
	
			String strWarenkorbL = "DELETE" + " FROM Warenkorb"
					+ " WHERE email = '" + email + "';";
			System.out.println(strWarenkorbL);
			stmt6.executeUpdate(strWarenkorbL);
			}
//			if(torte != null)
//			{
//			String UpdateStringT = "UPDATE Torte SET bestand = bestand -" + 1
//									+ "WHERE produkt_id = '" + torte.produkt_id +"';";
//			anzahlUpdateT = stmt.executeUpdate(UpdateStringT);
//			}
//			
//			if(praline != null)
//			{
//			String UpdateStringP = "UPDATE Praline SET bestand = bestand -" + 1
//					+ "WHERE produkt_id = '" + praline.produkt_id +"';";
//			anzahlUpdateP = stmt.executeUpdate(UpdateStringP);
//			}
//			
//
//			if(anzahlUpdateT != 0) {
//				if(countObservers() > 0)
//					setChanged();
//					notifyObservers(torte.produkt_id);
//				
//			}
//			if(anzahlUpdateP != 0) {
//				if(countObservers() > 0)
//					setChanged();
//					notifyObservers(praline.produkt_id);
//				
//			}
						
			stmt1.close();
			stmt2.close();
			stmt3.close();
			stmt4.close();
			stmt5.close();
			stmt6.close();
			c.close();
			System.out.println("--------If did not exist: Table created successfully");}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		System.out.println("If did not exist: Table deleted");
	}




//public static JsonNode MengeAktuell(JsonNode obj) {
//	JsonNode BestandJ = null;
//	String produkt_id = obj.get("produkt_id").asText();
//	Integer bestand = null;
//
//	String waehlen = "SELECT * FROM Torte WHERE produkt_id = '"
//			+ produkt_id + "'";;
//	try {
//		PreparedStatement pstmt = connection.prepareStatement(waehlen);
//		ResultSet rs = pstmt.executeQuery();
//		
//		if (rs.next()) {
//			bestand = new Integer(rs.getInt("bestand"));
//		}
//
//		ObjectMapper mapper = new ObjectMapper();
//		BestandJ = mapper.readTree("{\"produkt_id\":\"" + produkt_id
//				+ "\",\"Bestand\":\"" + bestand.toString() + "\"}");
//		System.out.println("JSON-Bestand: " + BestandJ);
//
//	} catch (SQLException | IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
//	catch (Exception e) {
//	System.err.println(e.getClass().getName() + ": " + e.getMessage());
//	}
//
//	return BestandJ;
//	}
}