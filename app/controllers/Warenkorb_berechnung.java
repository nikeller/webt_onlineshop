package controllers;

public class Warenkorb_berechnung {
	private long preis = 0;
	

	private Warenkorb_berechnung(long preis) {
		super();
		this.preis = preis;
	}


	public long berechne(long listenpreis) {

		for (int i = 0; i <= 2; i++) {
			preis += listenpreis;
		}
		return preis;
	}

	public long getPreis() {
		return preis;
	}
	public void setPreis(long preis) {
		this.preis = preis;
	}
}
