package org.foobarspam.examenFinal.business;

import java.util.ArrayList;

public class ProxyMrMeeseeks {

	private MrMeeseeks MrMee ;
	//private ArrayList<MrMeeseeks> setMrMee;
	
	
	/*Constructor*/
	public ProxyMrMeeseeks(){
		
	}
	
	/*Getters y Setters*/
	public MrMeeseeks getMrMe(){
		
		return this.MrMee;
	}
	
	
	/*Metodos*/
	public void pushButton(ArrayList<MrMeeseeks> setMrMee){
		createMrMeeseeks(setMrMee);
				
	}

	private void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMee) {
		MrMee = new MrMeeseeks();
		setMrMee.add(MrMee);
		
	}
	
	
}
