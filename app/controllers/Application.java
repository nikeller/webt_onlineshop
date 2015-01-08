package controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;



import models.Gebaeck;
import models.JDBC;
import models.Model;
import models.Praline;
import models.Torte;
import models.User;
import play.*;
import play.data.*;
import play.mvc.*;
import views.html.*;

import com.google.gson.Gson; 
import com.google.gson.JsonArray; 
import com.google.gson.JsonObject; 

public class Application extends Controller {
	
    public static Result index() {
        session("Bezeichnung","");
       session("Preis", "");
        return ok(index.render("Your new application is ready."));
    }
   
    public static Result submit(String ware, String preis){
//	      if (session("warenkorb") == null) {
//	            return redirect("/");
//	          }
//      session("warenkorb","Test");
    	session("Bezeichnung", "ware");
    	session("Preis", "preis");
    	
     return ok();
//	      
   }

	public static Result Kategorie_Torten() {
	      if (session("warenkorb") == null) {
//	            return redirect("/");
	          }
        
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
    
    
    public static Result Registrierung() throws IOException{ 
    		return ok(Registrierung.render(""));

    }
    
  
    
    
    public static Result CheckPLZ(String eingabe) throws IOException{
   	
    	Gson gson = new Gson();
    	String allePLZ = "";
    	 try { 
    	        // Datei "plz.json" über einen Stream einlesen 
    	        FileInputStream input = new FileInputStream("app/views/PLZ.json"); 
    	        
    	        BufferedReader reader = new BufferedReader(new InputStreamReader(input)); 
    	        
    	        // Datei als JSON-Objekt einlesen 
    	        JsonObject json = gson.fromJson(reader, JsonObject.class); 
    	        
    	        // Attribut "plzorte" als Array lesen 
    	        com.google.gson.JsonArray plzOrte = json.getAsJsonArray("plzOrte"); 
    	        String aktuellerWert="";
    	        
    	        for(int i = 0; i < plzOrte.size() && plzOrte.get(i).getAsJsonObject() != null; i++){ 
    	            JsonObject jObj = plzOrte.get(i).getAsJsonObject(); 
    	            System.out.println(i+".DEBUG Ort:"+ jObj.get("ort").getAsString());
    	            aktuellerWert = jObj.get("ort").getAsString();
    	            if(aktuellerWert.startsWith(eingabe))
    	            {
    	            	allePLZ= "<p id='"+i+"' onclick='abc("+i+")'>" +aktuellerWert+"</p>" + allePLZ;
    	            } 
    	            
    	            reader.close();    
    	            
    	        } 
    	        System.out.println("------"); 
	            System.out.println(allePLZ);
    	    } catch (FileNotFoundException e) { 
    	        e.printStackTrace(); 
    	    } 
  
    	return ok(allePLZ);
    }
    
    public static Result AddWare(String Name, String Menge, String Preis) throws IOException{
       
  
    	return ok(Name, Menge);
    } 
    
    public static Result Warenkorb(){
//    	String ware= session("Bezeichnung", "ware");
    			
    	return ok(Warenkorb.render());
    }
    
    public static Result Kasse(){
    	return ok(Kasse.render());
    }


}
