package models;

import java.util.Collection;
import java.util.HashSet;

public class Model {

	public static final Model sharedInstance = new Model();
	
	private Collection<Torte> torten = new HashSet<Torte>();
	
	public Model() {
		//Collections von Torte, Pralinen, Gebäck und User	
		Torte torte1 = new Torte(1, "a", "b", "c", "d", 2);
		Torte torte2 = new Torte(2, "e", "f", "g", "h", 3);
		TorteHinzufuegen(torte1);
		TorteHinzufuegen(torte2);
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
	
}
