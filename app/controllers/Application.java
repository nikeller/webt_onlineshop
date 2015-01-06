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
		//List<Torten> data = Data.getAllTorten();
    	return ok(Kategorie_Torten.render(Torten));
    }
    
    public static Result Kategorie_Pralinen() {
    	Collection<Praline> Pralinen = new HashSet<Praline>();
    	Pralinen = Model.sharedInstance.gibAllePralinen();
    	return ok(Kategorie_Pralinen.render(Pralinen));
    }
    
    public static Result Kategorie_Gebaeck() {
    	return ok(Kategorie_Gebaeck.render());
    }
    
    public static Result Registrierung() throws IOException{  
//        if (session("show") == null) {
//            return redirect("/");
//          }
//    	
//    	Gson gson = new Gson();
//    	String allePLZ = "";
//    	 try { 
//    	        // Datei "personen.json" über einen Stream einlesen 
//    	        FileInputStream input = new FileInputStream("app/views/PLZ.json"); 
//    	        
//    	        BufferedReader reader = new BufferedReader(new InputStreamReader(input)); 
//    	        
//    	        // Datei als JSON-Objekt einlesen 
//    	        JsonObject json = gson.fromJson(reader, JsonObject.class); 
//    	        
//    	        // Attribut "personen" als Array lesen 
//    	        com.google.gson.JsonArray plzOrte = json.getAsJsonArray("plzOrte"); 
//
//    	        for(int i = 0; i < plzOrte.size() && plzOrte.get(i).getAsJsonObject() != null; i++){ 
//    	            JsonObject jObj = plzOrte.get(i).getAsJsonObject(); 
//
//    	            // Attribute ausgeben z.B.: name, alter und hobbies 
////    	            System.out.println(jObj.get("plz").getAsString()); 
////    	            System.out.println(jObj.get("ort").getAsString()); 
//    	        
//    	            String aktuellerWert = jObj.get("ort").getAsString();
//    	            if(aktuellerWert.startsWith(eingabe))
//    	            {
//    	            	allePLZ= allePLZ + aktuellerWert;
//    	            }
//    	            session().clear();
////    	            System.out.println(jObj.get("ort").getAsString()); 
////    	        
////    	            
////    	            
////    	            allePLZ= allePLZ + aktuellerWert;
////    	            
////    	            System.out.println("------"); 
////    	            System.out.println(allePLZ);
//    	            
//    	           reader.close();
//    	           
//    	            
//    	        } 
//    	    } catch (FileNotFoundException e) { 
//    	        e.printStackTrace(); 
//    	        return redirect("/");
//    	    } 
// 

         

         
    	return ok(Registrierung.render(" "));
    }
    
    
    public static Result TestStuff(String eingabe) throws IOException{
    	
//        if (session("show") == null) {
//            return redirect("Kategorie_Gebaeck.scala.html");
//          }
    	
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

    	        for(int i = 0; i < plzOrte.size() && plzOrte.get(i).getAsJsonObject() != null; i++){ 
    	            JsonObject jObj = plzOrte.get(i).getAsJsonObject(); 
    	        
    	            String aktuellerWert = jObj.get("ort").getAsString();
    	            if(aktuellerWert.startsWith(eingabe))
    	            {
    	            	allePLZ= allePLZ + aktuellerWert;
    	            }
    	            session().clear();
//    	            System.out.println(jObj.get("ort").getAsString()); 
//    	        
//    	            
//    	            
//    	            allePLZ= allePLZ + aktuellerWert;
//    	            
    	            System.out.println("------"); 
    	            System.out.println(allePLZ);
    	            
    	           reader.close();
    	           
    	            
    	        } 
    	    } catch (FileNotFoundException e) { 
    	        e.printStackTrace(); 
    	        return redirect("Kategorie_Gebaeck.scala.html");
    	    } 
 

         

         
    	return ok(Registrierung.render(allePLZ));
    }
    
    
    public static Result Warenkorb(){
    	return ok(Warenkorb.render());
    }
    
    public static Result Kasse(){
    	return ok(Kasse.render());
    }


}
