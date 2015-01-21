package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import models.Model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.mvc.WebSocket;

public class ObserverPage implements Observer {
	
	public WebSocket.Out<Integer[]> shop;
	
	public ObserverPage(){
		Model.sharedInstance.addObserver(this);
	}
	public void update(Observable arg0, Object bestand) {

		
		try {
			shop.write(Model.sharedInstance.BestandAktuell((int) bestand));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
