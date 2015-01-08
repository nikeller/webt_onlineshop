package models;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import play.db.DB;

import controllers.Assets;

public class Model {

	public static final Model sharedInstance = new Model();

	private Collection<Torte> torten = new HashSet<Torte>();
	private Collection<Praline> pralinen = new HashSet<Praline>();
	private Collection<Gebaeck> gebaecken = new HashSet<Gebaeck>();

	public Model() {

		// Collections von Torte, Pralinen, Gebäck und User
//		Torte torte1 = new Torte(1, "Torte1", "Beschreibung Torte1",
//				"@routes.Assets.at(\"images/Torte_001.jpg\")", "T", 10);
//		Torte torte2 = new Torte(2, "Torte2", "Beschreibung Torte2",
//				"Bild Torte2", "T", 11);
//		Torte torte3 = new Torte(3, "Torte3", "Beschreibung Torte3",
//				"Bild Torte3", "T", 12);
//		TorteHinzufuegen(torte1);
//		TorteHinzufuegen(torte2);
//		TorteHinzufuegen(torte3);

//		Praline praline1 = new Praline(4, "Praline1", "Beschreibung Praline1",
//				"Bild Praline1", "P", 1);
//		Praline praline2 = new Praline(5, "Praline2", "Beschreibung Praline2",
//				"Bild Praline2", "P", 1);
//		Praline praline3 = new Praline(6, "Praline3", "Beschreibung Praline3",
//				"Bild Praline3", "P", 1);
//		PralineHinzufuegen(praline1);
//		PralineHinzufuegen(praline2);
//		PralineHinzufuegen(praline3);

//		Gebaeck gebaeck1 = new Gebaeck(7, "Gebäck1", "Beschreibung Gebäck1",
//				"Bild Gebäck1", "G", 6);
//		Gebaeck gebaeck2 = new Gebaeck(8, "Gebäck2", "Beschreibung Gebäck2",
//				"Bild Gebäck2", "G", 7);
//		Gebaeck gebaeck3 = new Gebaeck(9, "Gebäck3", "Beschreibung Gebäck3",
//				"Bild Gebäck3", "G", 8);
//		GebaeckHinzufuegen(gebaeck1);
//		GebaeckHinzufuegen(gebaeck2);
//		GebaeckHinzufuegen(gebaeck3);
		
//		User user1 = new User("a@b.com", "abcdef");
//		User user2 = new User("c@d.com", "ghijkl");
//		User user3 = new User("e@f.com", "mnopqr");
//		UserHinzufuegen(user1);
//		UserHinzufuegen(user2);
//		UserHinzufuegen(user3);
	}

	public static ArrayList<Torte> torte = new ArrayList<Torte>();
	public static ArrayList<Praline> praline = new ArrayList<Praline>();
	public static ArrayList<Gebaeck> gebaeck = new ArrayList<Gebaeck>();

	private static Connection connection = DB.getConnection();

	public Collection<Torte> getTorten() {
		torte.clear();
		try {
			String torteInfoSQL = "SELECT * FROM Torte;";
			PreparedStatement pstmt = connection.prepareStatement(torteInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Torte torten = new Torte(rs.getInt("id"), rs.getString("name"),
						rs.getString("pfad"), rs.getString("beschr"),
						rs.getString("kategorie_id"), rs.getFloat("preis"));

				torte.add(torten);

			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return torte;

	}

	public Collection<Praline> getPralinen() {
		praline.clear();
		try {
			String pralineInfoSQL = "SELECT * FROM Praline;";
			PreparedStatement pstmt = connection.prepareStatement(pralineInfoSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Praline pralinen = new Praline(rs.getInt("id"), rs.getString("name"),
						rs.getString("pfad"), rs.getString("beschr"),
						rs.getString("kategorie_id"), rs.getFloat("preis"));

				praline.add(pralinen);

			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return praline;

	}
	
	public Collection<Gebaeck> getGebaeck() {
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


	private ArrayList<User> users = new ArrayList<User>();
	

	public User getUser(String email) {
		String getUserSQL = "SELECT * FROM User WHERE User.EMail = '"
				+ email + "'";
		try {
			PreparedStatement pstmt = connection.prepareStatement(getUserSQL);
			ResultSet rs = pstmt.executeQuery();
			User user = new User(rs.getString("KundenNr"),
					rs.getString("EMail"));
			return user;
		} catch (SQLException e) {
			System.out.println("User mit EMail " + email + " nicht gefunden!");
			e.printStackTrace();
		}
		return null;
	}
	
	public void TorteHinzufuegen(Torte torte) {
		torten.add(torte);
	}

	public void TorteEntfernen(Torte torte) {
		torten.remove(torte);
	}

	public Collection<Torte> gibAlleTorten() {
		return torten;
	}

	public void PralineHinzufuegen(Praline praline) {
		pralinen.add(praline);

	}

	public void PralineEntfernen(Praline praline) {
		pralinen.remove(praline);
	}

	public Collection<Praline> gibAllePralinen() {
		return pralinen;
	}

	public void GebaeckHinzufuegen(Gebaeck gebaeck) {
		gebaecken.add(gebaeck);

	}

	public void GebaeckEntfernen(Gebaeck gebaeck) {
		gebaecken.remove(gebaeck);
	}

	public Collection<Gebaeck> gibAlleGebaecken() {
		return gebaecken;
	}
	
	public void UserHinzufuegen(User user){
		users.add(user);
	}

	public void UserEntfernen(User user){
		users.remove(user);
	}
	
	public Collection<User> gibAlleUser(){
		return users;
	}

	
}
