package models;

public class User {
	public String email;
	public String passwort;
	public String passwortWDH;
	public String vorname;
	public String nachname;
	public String adresse;
	public String plz;
	public User(String email, String passwort, String passwortWDH,  String vorname, String nachname,
			String adresse, String plz) {
		this.email = email;
		this.passwort = passwort;
		this.passwortWDH=passwortWDH;
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
		this.plz = plz;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String getPasswortWDH() {
		return passwortWDH;
	}

	public void setPasswortWDH(String passwortWDH) {
		this.passwortWDH = passwortWDH;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	
	
	
}
