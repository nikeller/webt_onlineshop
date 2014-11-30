package controllers;

import java.util.List;

import models.Anmeldung;
import models.KategorieTorten;
import play.*;
import play.api.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {	



	public static Result index() {
		return ok(index.render("bla"));
    }
	
	

	public static Result Kategorie_Torten() {
        return ok(Kategorie_Torten.render());
    }

	public static Result Kategorie_Pralinen() {
        return ok(Kategorie_Pralinen.render());
    }

	public static Result Kategorie_Gebaeck() {
        return ok(Kategorie_Gebaeck.render());
    }
	
	public static Result Registrierung() {
        return ok(Registrierung.render());
    }
	
	
	public static Result Warenkorb() {
        return ok(Warenkorb.render());
    }
	
	public static Result Kasse() {
        return ok(Kasse.render());
    }
}
