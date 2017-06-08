package org.foobarspam.examenFinal.business;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.examenFinal.interfaces.Doable;

public class MrMeeseeks implements Doable{

	/*Propiedades*/
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private static AtomicInteger RESPONDE_GENERATOS = new AtomicInteger(0);
	private Integer id;
	private ArrayList<String> messageOnRequest;
	private String messageOnDone = "";
	private String messageOnExplode = "All done!";
	
	/*Constructor*/
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
	}

	/*Getters y Setters*/
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	
	/*Metodos*/
	public void formulateRequest(String first, String second){
		
		String messageGenerated = generateMessageOnRequest();
		System.out.println(messageGenerated);
		
		String response = doRequest(first, second);
		System.out.println(response);
		
		
	}
	
	public void sayMessageOnCreate(){
		System.out.print("I'm Mr Meeseeks! Look  at me!");
	}
	
	public void sayMessageOnExplode(){
		System.out.print(messageOnExplode);
	}
	
	public String generateMessageOnRequest(){
		
		ArrayList<String> mrMeeseeksLanguage = new ArrayList<String>(3);
		mrMeeseeksLanguage.add("Oh, yeah! Yes, ma'am!");
		mrMeeseeksLanguage.add("Oooh yeah! Can do!");
		mrMeeseeksLanguage.add("Yes sireee!");
		
		Integer position = RESPONDE_GENERATOS.incrementAndGet();
		
		
		String messageGenerated = mrMeeseeksLanguage.get(position -1);
		
		return messageGenerated;
	}

	public String doRequest(String first, String second) {

		String response = first + second;
		
		return response;
	}
}
