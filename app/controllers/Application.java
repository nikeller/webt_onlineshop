package controllers;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import models.Data;
import models.Model;
import models.Torte;
import play.*;
import play.data.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result Kategorie_Torten() {
    	Collection<Torte> Torten =  new HashSet<Torte>();
//    	String produkt_name = "Torte1";
//		String produkt_beschreibung = "Beschreibung für Torte1";
//		String bild = "@routes.Assets.at(\"images/Torte_003.jpg\")";
//		String kategorie_id = "T";
//		//Torte torte1 = new Torte(1, produkt_name, produkt_beschreibung, bild, kategorie_id, 14);
		
    	Torten = Model.sharedInstance.gibAlleTorten();
		System.out.println("Torten: " + Torten.size());
		//List<Torten> data = Data.getAllTorten();
    	return ok(Kategorie_Torten.render(Torten));
    }
    
    public static Result Kategorie_Pralinen() {
    	return ok(Kategorie_Pralinen.render());
    }
    
    public static Result Kategorie_Gebaeck() {
    	return ok(Kategorie_Gebaeck.render());
    }
    
    public static Result Registrierung(){
    	return ok(Registrierung.render());
    }
        
    public static Result Warenkorb(){
    	return ok(Warenkorb.render());
    }
    
    public static Result Kasse(){
    	return ok(Kasse.render());
    }

}
