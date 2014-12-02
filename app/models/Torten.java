package models;

import java.util.*;

import com.avaje.ebean.Ebean;

import play.db.ebean.Model;


public class Torten{

	public long produkt_id;
	
	public String produkt_name;
	
	public String produkt_beschreibung;
	
	public String bild;
	
	public String kategorie_id;
	
	public long preis;


	public Torten(long produkt_id, String produkt_name,
			String produkt_beschreibung, String bild, String kategorie_id,
			long preis) {
		this.produkt_id = produkt_id;
		this.produkt_name = produkt_name;
		this.produkt_beschreibung = produkt_beschreibung;
		this.bild = bild;
		this.kategorie_id = kategorie_id;
		this.preis = preis;
	} 
	
	public long getProdukt_id() {
		return produkt_id;
	}

	public void setProdukt_id(long produkt_id) {
		this.produkt_id = produkt_id;
	}

	public String getProdukt_name() {
		return produkt_name;
	}

	public void setProdukt_name(String produkt_name) {
		this.produkt_name = produkt_name;
	}

	/*public static Model.Finder<Long, Torten> find = new Model.Finder<Long, Torten>
	(Long.class, Torten.class);
	
	public static List<Torten> getAllTorten(){
		List<Torten> torten = new ArrayList<Torten>();
		torten = Ebean.find(Torten.class).findList();
		return torten;
	}
	*/
	
	
}
