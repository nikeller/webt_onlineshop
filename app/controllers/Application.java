package controllers;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import models.Data;
import models.Gebaeck;
import models.JDBC;
import models.Model;
import models.Praline;
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
		
    	Torten = Model.sharedInstance.getTorten();
    	
    	
    	//Ausführungszeilen (Kontrolle) zu JDBC
//    	JDBC ausgabe = new JDBC();
//    	ausgabe.createTable();
//    	ausgabe.insertInto();
//    	ausgabe.createTablePraline();
//    	ausgabe.insertIntoPraline();
//    	ausgabe.select();
		//List<Torten> data = Data.getAllTorten();
    	
//    	System.out.println(Model.sharedInstance.gibAlleTorten());
    	
    	return ok(Kategorie_Torten.render(Torten));
//    	return ok(Kategorie_Torten.render(Model.sharedInstance.gibAlleTorten()));
    }
    
    public static Result Kategorie_Pralinen() {
    	Collection<Praline> Pralinen = new HashSet<Praline>();
    	Pralinen = Model.sharedInstance.getPralinen();
    	return ok(Kategorie_Pralinen.render(Pralinen));
    }
    
    public static Result Kategorie_Gebaeck() {
    	JDBC ausgabe =new JDBC();
    	ausgabe.createTableUser();
    	return ok(Kategorie_Gebaeck.render());
    }
    
//    public static Result login() {
//		if (session("connected") == null) {
//
//			return ok(login.render());
//		} else {
//			// wenn schon eingeloggt weiterleitung auf index
//			return redirect("/");
//		}
//	}
//    
//	public static Result checkLogin() {
//		final Map<String, String[]> values = request().body()
//				.asFormUrlEncoded();
//		User registrierterUser = Model.sharedInstance.getUser(values
//				.get("email")[0]);
//		String checkEmail = values.get("email")[0];
//		String checkPassword = values.get("password")[0];
//		if (registrierterUser != null) {
//			if (registrierterUser.getEmail().equals(checkEmail)) {
//				if (registrierterUser.getPsw().equals(checkPassword)) {
//					session("connected", "" + registrierterUser.getEmail());
//					return redirect("/Warenkorb");
//				}
//			}
//		}
//		// return
//		// redirect(controllers.routes.Application.login("Falsche Email oder Password"));
//		return redirect("/Registrierung");
//	}
    
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
