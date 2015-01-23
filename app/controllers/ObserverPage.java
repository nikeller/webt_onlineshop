package controllers;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import models.Model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.mvc.WebSocket;

public class ObserverPage implements java.util.Observer {
	
	public WebSocket.Out<JsonNode> sweetshop;
	public WebSocket.Out<String> name;
	
	public ObserverPage(){
		Model.sharedInstance.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object name) {
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonname = null;
		try {
			jsonname = mapper.readTree("{\"name\":\""+name+"\"}");
			System.out.println("JSON: "+jsonname);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sweetshop.write(Model.sharedInstance.MengeAktualisiert(jsonname));
	}

}