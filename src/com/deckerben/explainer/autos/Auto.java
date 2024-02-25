package com.deckerben.explainer.autos;

public class Auto extends LandFahrzeug{
	
	private final String marke;
	
	public Auto(String dasKennzeichen, String dieMarke) {
		super(dasKennzeichen, 4);
		marke = dieMarke;
	}
	
	public String getMarke(){
	    return marke;
	}
}
