package controllers;

import models.Torten;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result Kategorie_Torten() {
    	String produkt_name = "Torte1";
		String produkt_beschreibung = "Beschreibung für Torte1";
		String bild = "Bild für Torte1";
		String kategorie_id = "T";
		Torten torten = new Torten(1, produkt_name , produkt_beschreibung, bild, kategorie_id, 14);
       
    	return ok(Kategorie_Torten.render(torten));
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
