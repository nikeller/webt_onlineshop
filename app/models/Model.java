package models;


import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JDialog;
import javax.swing.JLabel;

import play.db.DB;
import controllers.Assets;

public class Model {

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
					rs.getString("passwort"), rs.getString("passwortWDH"), rs.getString("vorname"),
					rs.getString("nachname"), rs.getString("adresse"),
					rs.getString("plz"));
			return user;
		} catch (SQLException e) {
			System.out.println("User mit EMail " + email + " nicht gefunden!");
			e.printStackTrace();
		
		}
		return null;
		
	}
	
}
