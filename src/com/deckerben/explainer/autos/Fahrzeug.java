package com.deckerben.explainer.autos;

public class Fahrzeug {
	
	protected final String kennzeichen;
	
	protected Fahrzeug(String dasKennzeichen){
		kennzeichen = dasKennzeichen;
	}
	
	public String getKennzeichen(){
	    return kennzeichen;
	}
	
}
