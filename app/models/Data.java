package models;

import java.util.*;

import com.avaje.ebean.Ebean;

public class Data {

	
	List<Torten> torten = new ArrayList<Torten>();
	
	//add(0, 1, "TORTE1", "BESCHRT1", "BILD1", "KT", 14});
	List<Torten> list = Arrays.asList();
	
	
	
	public ArrayList<Torten> getAllTorten(){
	ArrayList<Torten> torten = new ArrayList<Torten>();
	torten = (ArrayList<Torten>) Ebean.find(Torten.class).findList();
	return torten;

	/*for(int cnt=0; cnt<3; cnt++){
		Torten xx = new Torten();
		xx.setProdukt_id(+cnt);
		xx.setProdukt_name("Torte" +cnt);
		torten.add(xx);
	}*/
	}
}
