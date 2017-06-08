package org.foobarspam.examenFinal.business;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.examenFinal.interfaces.Doable;

public class MrMeeseeks implements Doable{

	/*Propiedades*/
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	private ArrayList<String> messageOnRequest;
	private String messageOnDone = "";
	private String messageOnExplode = "";
	
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
		
		System.out.println(first + second);
		
	}
	
	public void sayMessageOnCreate(){
		System.out.print("I'm Mr Meeseeks! Look  at me!");
	}
	
	public void sayMessageOnExplode(){
		System.out.print(messageOnExplode);
	}
	
	public String generateMessageOnRequest(){
		
		String message = "Oh, yeah! Yes, ma'am!";
		return message;
	}

	public Object doRequest(Object accion, Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 *  elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */	
}
