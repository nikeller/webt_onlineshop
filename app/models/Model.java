package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import controllers.Assets;

public class Model {

	public static final Model sharedInstance = new Model();
	
	private Collection<Torte> torten = new HashSet<Torte>();
	private Collection<Praline> pralinen = new HashSet<Praline>();
	private Collection<Gebaeck> gebaecken = new HashSet<Gebaeck>();
	private ArrayList<User> users = new ArrayList<User>();
	
	public Model() {
		//Collections von Torte, Pralinen, Gebäck und User	
		String pfad="/assets/images/Torte_001.jpg";
		Torte torte1 = new Torte(1, "Torte1", "Beschreibung Torte1", pfad, "T", 10);
		Torte torte2 = new Torte(2, "Torte2", "Beschreibung Torte2", "Bild Torte2", "T", 11);
		Torte torte3 = new Torte(3, "Torte3", "Beschreibung Torte3", "Bild Torte3", "T", 12);
		TorteHinzufuegen(torte1);
		TorteHinzufuegen(torte2);
		TorteHinzufuegen(torte3);
		
		Praline praline1 = new Praline(4,"Praline1", "Beschreibung Praline1", "Bild Praline1", "P", 1);
		Praline praline2 = new Praline(5,"Praline2", "Beschreibung Praline2", "Bild Praline2", "P", 1);
		Praline praline3 = new Praline(6,"Praline3", "Beschreibung Praline3", "Bild Praline3", "P", 1);
		PralineHinzufuegen(praline1);
		PralineHinzufuegen(praline2);
		PralineHinzufuegen(praline3);
		
		Gebaeck gebaeck1 = new Gebaeck(7, "Gebäck1", "Beschreibung Gebäck1", "Bild Gebäck1", "G", 6);
		Gebaeck gebaeck2 = new Gebaeck(8, "Gebäck2", "Beschreibung Gebäck2", "Bild Gebäck2", "G", 7);
		Gebaeck gebaeck3 = new Gebaeck(9, "Gebäck3", "Beschreibung Gebäck3", "Bild Gebäck3", "G", 8);
		GebaeckHinzufuegen(gebaeck1);
		GebaeckHinzufuegen(gebaeck2);
		GebaeckHinzufuegen(gebaeck3);
		
		User user1 = new User("a@b.com", "abcdef");
		User user2 = new User("c@d.com", "ghijkl");
		User user3 = new User("e@f.com", "mnopqr");
		UserHinzufuegen(user1);
		UserHinzufuegen(user2);
		UserHinzufuegen(user3);
		
	}
	
	
	public void TorteHinzufuegen(Torte torte){
		torten.add(torte);
	}

	public void TorteEntfernen(Torte torte){
		torten.remove(torte);
	}
	
	public Collection<Torte> gibAlleTorten(){
		return torten;
	}
	
	public void PralineHinzufuegen(Praline praline){
		pralinen.add(praline);
	
	}
	
	public void PralineEntfernen(Praline praline){
		pralinen.remove(praline);
	}
	
	public Collection<Praline> gibAllePralinen(){
		return pralinen;
	}
	
	public void GebaeckHinzufuegen(Gebaeck gebaeck){
		gebaecken.add(gebaeck);
	
	}
	
	public void GebaeckEntfernen(Gebaeck gebaeck){
		gebaecken.remove(gebaeck);
	}
	
	public Collection<Gebaeck> gibAlleGebaecken(){
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
