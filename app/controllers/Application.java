package controllers;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;



import java.util.Map;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Gebaeck;
import models.JDBC;
import models.Model;
import models.Praline;
import models.Torte;
import models.User;
import models.WarenkorbM;
import play.*;
import play.api.mvc.Session;
import play.data.*;
import play.mvc.*;
import views.html.*;

import com.google.gson.Gson; 
import com.google.gson.JsonArray; 
import com.google.gson.JsonObject; 

public class Application extends Controller {
	
	private static Application application = new Application();
	private static final Object JDialog = null;
	public static HashMap<String, HashMap<String, String>> outerMap = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, String> innerMap = new HashMap<String, String>();
	public static int a;
	public static int eingeloggt;
	static JDBC database = new JDBC();
	public static int status; 
    private static Random rand = new Random();
    private static int i=0;
    
    
    public static Result index() throws SQLException {
//session().clear();
//    	Model.sharedInstance.deleteWk();
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


//    	final Map<String, float[]> values = request().body().asFormUrlEncoded();
//    	if (Model.sharedInstance.getUser(values.get("email")[0]) == null) {
    		database.insertIntoWarenkorb(email, ware, preisd);
    
//    		models.Warenkorb warenkorb = Model.sharedInstance.getWarenkorb(email);
//    		int a =warenkorb.getNr();    
    		
    		System.out.println(email +  ware + preisd);
    		return redirect("/Warenkorb");
    
//	      
   }

	public static Result Kategorie_Torten() {

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
//    	Ausführungszeilen (Kontrolle) zu JDBC
//    JDBC ausgabe = new JDBC();
//    	ausgabe.createTable();
//    	ausgabe.insertInto();
//    	ausgabe.createTablePraline();
//    	ausgabe.insertIntoPraline();
//    	ausgabe.createTableUser();
//    	ausgabe.select();
//		ausgabe.createTableWarenkorb();
    	
		return ok(Kategorie_Torten.render(Torten, status));
	
    }
    
    public static Result Kategorie_Pralinen() {
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
    
    public static Result RegistrierungP() throws SQLException {
        
    	final Map<String, String[]> values = request().body().asFormUrlEncoded();
    	if (Model.sharedInstance.getUser(values.get("email")[0]) == null) {
    		
    		String email = values.get("email")[0];
    		String passwort = values.get("passwort")[0];
    		String passwortWDH = "braucht niemand";
    		String vorname = values.get("vorname")[0];
    		String nachname = values.get("nachname")[0];
    		String adresse = values.get("adresse")[0];
    		String plz = values.get("plz")[0];
    		int hash = passwort.hashCode();
    		
    		database.insertIntoUser(email, passwort, passwortWDH, vorname, nachname, adresse, plz);
    		    

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
//    	            	allePLZ= aktuellerWert+  "." + allePLZ ;
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

    
    
    public static Result AnmeldenP() {
    	
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

				if (KundeReg.getPasswort().equals(PasswortCheck)) {
					
		            session("connected", values.get("emailA")[0]);
		            System.out.println("Eingeloggt");
		            System.out.println(session("connected"));
		            
					return redirect("/");
				} else {
					int b = -1;
					return redirect("/Registrierung");
				}
			} else {
				int b = -1;
				return redirect("/Registrierung");
			}
		} else {
		
			int b = -1;
			return redirect("/Registrierung");

		}

	}
    
    public static Result Abmeldung(){
    	String user = session("connected");
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
		for (int i=0;i<WKM.size();i++){
		WKM.remove(i);
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

    public static Result Anmeldung(){
    	return ok(Anmeldung.render());
    }

}
