package models;

import play.db.ebean.Model;


public class Torten extends Model{

	public long produkt_id;
	
	public String produkt_name;
	
	public String produkt_beschreibung;
	
	public String bild;
	
	public long kategorie_id;
	
	public long preis; 
	
	
}
