package models;

public class WarenkorbM {
	public long id; 
	public String email;
	public String ware;
	public double preis;
	public WarenkorbM(long id,String email, String ware, double preis) {
		this.id = id; 
		this.email = email;
		this.ware = ware;
		this.preis = preis;
	}
	
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWare() {
		return ware;
	}
	public void setWare(String ware) {
		this.ware = ware;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	
	
}
