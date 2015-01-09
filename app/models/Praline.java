package models;

public class Praline {

	public long produkt_id;
	
	public String produkt_name;
	
	public String produkt_beschreibung;
	
	public String bild;
	
	public String kategorie_id;
	
	public int bestand;
	
	public float preis;

	public Praline(long produkt_id, String produkt_name,
			String produkt_beschreibung, String bild, String kategorie_id,
			int bestand, float preis) {
		this.produkt_id = produkt_id;
		this.produkt_name = produkt_name;
		this.produkt_beschreibung = produkt_beschreibung;
		this.bild = bild;
		this.kategorie_id = kategorie_id;
		this.bestand = bestand;
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

	public String getProdukt_beschreibung() {
		return produkt_beschreibung;
	}

	public void setProdukt_beschreibung(String produkt_beschreibung) {
		this.produkt_beschreibung = produkt_beschreibung;
	}

	public String getBild() {
		return bild;
	}

	public void setBild(String bild) {
		this.bild = bild;
	}

	public String getKategorie_id() {
		return kategorie_id;
	}

	public void setKategorie_id(String kategorie_id) {
		this.kategorie_id = kategorie_id;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}
	
	
}
