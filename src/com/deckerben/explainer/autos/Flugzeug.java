package com.deckerben.explainer.autos;

public class Flugzeug extends LuftFahrzeug{
	
	private String airline;
	
	public Flugzeug(String dasKennzeichen, String dieAirline) {
		super(dasKennzeichen);
		airline = dieAirline;
	}
	
	public String getAirline(){
	    return airline;
	}
	
	public void setAirline(String airline){
	    this.airline = airline;
	}
	
}
