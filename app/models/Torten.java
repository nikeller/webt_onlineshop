package models;

import play.db.ebean.Model;


public class Torten extends Model{

	public long produkt_id;
	
	public String produkt_name;
	
	public String produkt_beschreibung;
	
	public String bild;
	
	public String kategorie_id;
	
	public long preis;

	public Torten(long produkt_id, String produkt_name,
			String produkt_beschreibung, String bild, String kategorie_id,
			long preis) {
		super();
		this.produkt_id = produkt_id;
		this.produkt_name = produkt_name;
		this.produkt_beschreibung = produkt_beschreibung;
		this.bild = bild;
		this.kategorie_id = kategorie_id;
		this.preis = preis;
	} 
	
	
	
}
