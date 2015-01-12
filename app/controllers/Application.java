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
import play.*;
import play.api.mvc.Session;
import play.data.*;
import play.mvc.*;
import views.html.*;

import com.google.gson.Gson; 
import com.google.gson.JsonArray; 
import com.google.gson.JsonObject; 

public class Application extends Controller {
	
	private static final Object JDialog = null;
	public static HashMap<String, HashMap<String, String>> outerMap = new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, String> innerMap = new HashMap<String, String>();
	public static int a;
	public static int eingeloggt;
	static JDBC database = new JDBC();
	
    private static Random rand = new Random();
//    static String wareGlobal;
//    static String preisGlobal;
    public static Result index() {

        return ok(index.render("Your new application is ready."));
    }
   
    public static Result submit(String ware, String preis) throws IOException{

			
    	//int r = Math.abs(rand.nextInt());
    	System.out.println(ware);
    	System.out.println(preis);
    	session("Ware", ware);
    	session("Preis", preis);
		
     return ok();
//	      
   }

	public static Result Kategorie_Torten() {

			
	      if (session("warenkorb") == null) {
//	            return redirect("/");
	          }

	      
	      Collection<Torte> Torten =  new HashSet<Torte>();
	      Torten = Model.sharedInstance.getTorten();
    	//Ausführungszeilen (Kontrolle) zu JDBC
//    	JDBC ausgabe = new JDBC();
//    	ausgabe.createTable();
//    	ausgabe.insertInto();
//    	ausgabe.createTablePraline();
//    	ausgabe.insertIntoPraline();
//    	ausgabe.createTableUser();
//    	ausgabe.select();
    	
    	return ok(Kategorie_Torten.render(Torten));
//    	return ok(Kategorie_Torten.render(Model.sharedInstance.gibAlleTorten()));
	
    }
    
    public static Result Kategorie_Pralinen() {

     	
    	Collection<Praline> Pralinen = new HashSet<Praline>();
    	Pralinen = Model.sharedInstance.getPralinen();
    	return ok(Kategorie_Pralinen.render(Pralinen));

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
    		
    		JDialog meinJDialog = new JDialog();
            // Titel wird gesetzt
            meinJDialog.setTitle("Registriert");         
            JLabel jReg = new JLabel("Hallo "+vorname +" "+ nachname +", Sie haben sich erfolgreich registriert!");
            jReg.setFont(new Font("Serif", Font.BOLD, 24));
            meinJDialog.add(jReg);
            // Breite und Höhe des Fensters werden 
            // auf 200 Pixel gesetzt
            meinJDialog.setSize(800,200);
            // Dialog wird auf modal gesetzt
            meinJDialog.setModal(true);
            // Wir lassen unseren Dialog anzeigen
            meinJDialog.setVisible(true);
            
    		
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
//    public static Result Warenkorb() throws IOException{
//    	String ware= session("Ware");
//    	String preis =session("Preis");
//    	try {
//			Thread.sleep(400);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	return ok(Warenkorb.render(wareGlobal , preisGlobal));
//    }
    
    
    public static Result AnmeldenP() {
    	
		final Map<String, String[]> values = request().body().asFormUrlEncoded();
		String Help= values.get("emailA")[0];
		User KundeReg = Model.sharedInstance.getUser(Help);
		String EmailCheck = values.get("emailA")[0];
		String PasswortCheck = values.get("passwortA")[0];
		 System.out.println(EmailCheck+" "+ PasswortCheck);
		 System.out.println(KundeReg);
        
		if (KundeReg != null) {
			if (KundeReg.getEmail().equals(EmailCheck)) {

				if (KundeReg.getPasswort().equals(PasswortCheck)) {

					JDialog meinJDialog = new JDialog();
		            // Titel wird gesetzt
		            meinJDialog.setTitle("Anmeldung erfolgreich");         
		            JLabel jReg = new JLabel("Hallo,"+KundeReg.nachname + " " + KundeReg.vorname + " Sie sind jetzt angemeldet!");
		            jReg.setFont(new Font("Serif", Font.BOLD, 24));
		            meinJDialog.add(jReg);
		            // Breite und Höhe des Fensters werden 
		            // auf 200 Pixel gesetzt
		            meinJDialog.setSize(800,200);
		            // Dialog wird auf modal gesetzt
		            meinJDialog.setModal(true);
		            // Wir lassen unseren Dialog anzeigen
		            meinJDialog.setVisible(true);
						//session("connected", "" + KundeReg.getEmail());
					
					return redirect("/");
				} else {
					JDialog meinJDialog = new JDialog();
		            // Titel wird gesetzt
		            meinJDialog.setTitle("Anmeldung fehlgeschlagen");         
		            JLabel jReg = new JLabel("Falsches Passwort");
		            jReg.setFont(new Font("Serif", Font.BOLD, 24));
		            meinJDialog.add(jReg);
		            // Breite und Höhe des Fensters werden 
		            // auf 200 Pixel gesetzt
		            meinJDialog.setSize(800,200);
		            // Dialog wird auf modal gesetzt
		            meinJDialog.setModal(true);
		            // Wir lassen unseren Dialog anzeigen
		            meinJDialog.setVisible(true);
					// Passwort falsch
					int b = -1;
					return redirect("/Registrierung");
				}
			} else {
				JDialog meinJDialog = new JDialog();
	            // Titel wird gesetzt
	            meinJDialog.setTitle("Registriert");         
	            JLabel jReg = new JLabel("Falsche E-Mail");
	            jReg.setFont(new Font("Serif", Font.BOLD, 24));
	            meinJDialog.add(jReg);
	            // Breite und Höhe des Fensters werden 
	            // auf 200 Pixel gesetzt
	            meinJDialog.setSize(800,200);
	            // Dialog wird auf modal gesetzt
	            meinJDialog.setModal(true);
	            // Wir lassen unseren Dialog anzeigen
	            meinJDialog.setVisible(true);
				// Benutzername falsch
				int b = -1;
				return redirect("/Registrierung");
			}
		} else {
			//modal bootstrap
			JDialog meinJDialog = new JDialog();
            // Titel wird gesetzt
            meinJDialog.setTitle("Registriert");         
            JLabel jReg = new JLabel("Noch nicht registriert!");
            jReg.setFont(new Font("Serif", Font.BOLD, 24));
            meinJDialog.add(jReg);
            // Breite und Höhe des Fensters werden 
            // auf 200 Pixel gesetzt
            meinJDialog.setSize(800,200);
            // Dialog wird auf modal gesetzt
            meinJDialog.setModal(true);
            // Wir lassen unseren Dialog anzeigen
            meinJDialog.setVisible(true);
			int b = -1;
			return redirect("/Registrierung");

		}
		// return
		// redirect(controllers.routes.Application.login("Falsche Email o. pwd"));

	}
    
    
    public static Result Warenkorb() throws IOException{

//    	String ware= session("Ware");
//    	String preis =session("Preis");
    	try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return ok(Warenkorb.render(session("Ware") , session("Preis")));
    }
    
    public static Result Kasse(){
    	return ok(Kasse.render());
    }

    public static Result Anmeldung(){
    	return ok(Anmeldung.render());
    }

}
