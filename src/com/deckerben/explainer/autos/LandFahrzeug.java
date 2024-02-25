package com.deckerben.explainer.autos;

public class LandFahrzeug extends Fahrzeug {
	
	protected final int anzahlRaeder;
	
	protected LandFahrzeug(String dasKennzeichen, int dieAnzahlRaeder) {
		super(dasKennzeichen);
		anzahlRaeder = dieAnzahlRaeder;
	}
	
	public int getAnzahlRaeder(){
	    return anzahlRaeder;
	}
}
