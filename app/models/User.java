package models;

public class User {
	public String email="";
	public String passwort="";
	
	
	public User(String email, String passwort) {
		this.email = email;
		this.passwort = passwort;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPasswort() {
		return passwort;
	}
	
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	} 
	
	
}
