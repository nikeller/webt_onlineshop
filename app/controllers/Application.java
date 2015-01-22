package controllers;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.sql.SQLException;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.WebSocket;

import java.util.Map;

//import models.JDBC;
import models.Model;
import models.Praline;
import models.Torte;
import models.User;
import models.WarenkorbM;

import play.mvc.*;
import views.html.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson; 
 
import com.google.gson.JsonObject; 

public class Application extends Controller {
	private static final Object lock = new Object();

	public static HashMap<String, HashMap<String, String>> outerMap = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, String> innerMap = new HashMap<String, String>();
	public static int a;
	public static int eingeloggt;
	public static int status; 
    
    
    public static Result index(){

    	String user = session("connected");
		System.out.println(user);
    	if (user!=null){
    		System.out.println("eingeloggt");
    		status = 1;
    	}
    	else {
    		System.out.println("nicht eingeloggt");
    		status = 0;
    	}
        return ok(index.render(status));
    }
   
    public static Result submit(String ware, String preis) throws IOException{
    	String email = session("connected");
    	double preisd = Double.parseDouble(preis);

    	Model.sharedInstance.insertIntoWarenkorb(email, ware, preisd);
       
    		Warenkorb();
    		System.out.println(email +  ware + preisd);
    		return ok();      
   }

	public static Result Kategorie_Torten() throws SQLException {

		String user = session("connected");
		System.out.println(user);
    	if (user!=null){
    		System.out.println("Torten: immernoch eingeloggt");
    		status = 1;
    	}
    	else {
    		System.out.println("Torten: nicht eingeloggt");
    		status = 0;
    	}
	

	      
	      Collection<Torte> Torten =  new HashSet<Torte>();
	      Torten = Model.sharedInstance.getTorten();
    	
		return ok(Kategorie_Torten.render(Torten, status));
	
    }
    
    public static Result Kategorie_Pralinen(){
    	String user = session("connected");
    	if (user!=null){
    		System.out.println("Pralinen: immernoch eingeloggt");
    		status = 1;
    	}
    	else {
    		System.out.println("Pralinen: nicht eingeloggt");
    		status = 0;
    	}
     	
    	Collection<Praline> Pralinen = new HashSet<Praline>();
    	Pralinen = Model.sharedInstance.getPralinen();
    	return ok(Kategorie_Pralinen.render(Pralinen, status));

    }
    
    public static Result Kategorie_Gebaeck() {

	    	return ok(Kategorie_Gebaeck.render());
    	

    }
    
    
    
    public static Result Registrierung() throws IOException{ 
			return ok(Registrierung.render(""));
    }
    
    public static Result RegistrierungP(){
        
    	final Map<String, String[]> values = request().body().asFormUrlEncoded();
    	if (Model.sharedInstance.getUser(values.get("email")[0]) == null) {
    		
    		String email = values.get("email")[0];
    		String passwort = values.get("passwort")[0];
    		String vorname = values.get("vorname")[0];
    		String nachname = values.get("nachname")[0];
    		String adresse = values.get("adresse")[0];
    		String plz = values.get("plz")[0];
    		int hash = passwort.hashCode();
    		String hashString = Integer.toString(hash);
    		
    		Model.sharedInstance.insertIntoUser(email, hashString, vorname, nachname, adresse, plz);
    		    

    		System.out.println(email + passwort +  vorname + nachname + adresse + plz + hash);
    		return redirect("/");
    	}
    	else {
    		return redirect("/");
    	}
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
    	        allePLZ = "";
    	        for(int i = 0; i < plzOrte.size() && plzOrte.get(i).getAsJsonObject() != null; i++){ 
    	            JsonObject jObj = plzOrte.get(i).getAsJsonObject(); 
    	            //System.out.println(i+".DEBUG Ort:"+ jObj.get("ort").getAsString());
    	            aktuellerWert = jObj.get("ort").getAsString();
    	            if(aktuellerWert.startsWith(eingabe))
    	            {
    
    	            	allePLZ= "<p id='"+i+"' abc("+i+")'>" +aktuellerWert+"</p>" + allePLZ;

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

    
    
    public static Result AnmeldenP(){
    	
		final Map<String, String[]> values = request().body().asFormUrlEncoded();
		String Help= values.get("emailA")[0];
		System.out.println("---------------------" +Help);
		User KundeReg = Model.sharedInstance.getUser(Help);
		String EmailCheck = values.get("emailA")[0];
		String PasswortCheck = values.get("passwortA")[0];
		 System.out.println(EmailCheck+" "+ PasswortCheck);
		 System.out.println(KundeReg);
        
		if (KundeReg != null) {
			if (KundeReg.getEmail().equals(EmailCheck)) {

				if (KundeReg.getPasswort().equals(Integer.toString(PasswortCheck.hashCode()))) {
					
		            session("connected", values.get("emailA")[0]);
		            System.out.println("Eingeloggt");
		            System.out.println(session("connected"));
		            
					return redirect("/");
				} else {
					return redirect("/Registrierung");
				}
			} else {
				return redirect("/Registrierung");
			}
		} else {
		
			return redirect("/Registrierung");

		}

	}
    
    public static Result Abmeldung(){
    	String user = session("connected");
    	System.out.println(user+"öööööööööööööööööööööööööööööööööööööööö");
    	session().clear();
    	return redirect("/");
    }
    
    
    public static Result Warenkorb() throws IOException{
    	String user = session("connected");
    	if (user!=null){
    		System.out.println("Warenkorb: immernoch eingeloggt");
    		status = 1;	
    	}
    	else {
    		System.out.println("Warenkorb: nicht eingeloggt");
    		status = 0;
    	}

    	Collection<WarenkorbM> WKM = new HashSet<WarenkorbM>();
    	if(WKM!=null){
    		for (int i=0;i<WKM.size();i++){
    			WKM.remove(i);
    		}
    	}
		//System.out.print("----------------"+WKM.size());
    	WKM = Model.sharedInstance.getWarenkorb(user);
//		System.out.print(WKM.size());
    	return ok(Warenkorb.render(WKM, status));
    	
    }
   
    public static Result Bestellung(){
    	Collection<WarenkorbM> WKM = new HashSet<WarenkorbM>();

		for (int i=0;i<WKM.size();i++){
		WKM.remove(i);
		}
		
    	String user = session("connected");
    	if (user!=null){
    		WKM = Model.sharedInstance.getWarenkorb(user);
    		Model.sharedInstance.WarenkorbL(user);
    		return redirect("/");
    		}
    	else{
    		return redirect("/Anmeldung");
    	}
	    	
    }
    
    public static Result Kasse(){
    	return ok(Kasse.render());
    }
    public static Result WaitingTime() throws InterruptedException{
    	synchronized(lock){
    		lock.wait(10);}
    	return redirect("/Warenkorb");
    }
    public static Result Anmeldung(){
    	session().clear();
    	return ok(Anmeldung.render());
    }
    
//    public static WebSocket<JsonNode> socket() {
//    	System.out.println("in socket");
//		return new WebSocket<JsonNode>() {
//			
//			public void onReady(WebSocket.In<JsonNode> in,
//					final WebSocket.Out<JsonNode> out) {
//				System.out.println(": WebSocketArtikel ready...");
//				final ObserverPage obs = new ObserverPage();
//				obs.shop = out;
//				System.out.println(": Anzahl observer: "
//						+ Model.sharedInstance.countObservers());
//				in.onMessage(new Callback<JsonNode>() {
//					public void invoke(JsonNode obj) {
//
//					}
//
//				});
//
//				in.onClose(new Callback0() {
//					public void invoke() {
//						// observer.remove(id);
//						Model.sharedInstance.deleteObserver(obs);
//
//						System.out.println(": Artikelansicht verlassen...");
//						System.out.println( ": Anzahl observer: "+ Model.sharedInstance.countObservers());
//					}
//				});
//
//			}
//		};
//	}

    
    
    

}
