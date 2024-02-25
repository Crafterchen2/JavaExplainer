package com.deckerben.explainer.haus;

import com.deckerben.explainer.autos.Auto;
import com.deckerben.explainer.autos.Fahrzeug;
import com.deckerben.explainer.autos.LandFahrzeug;
import com.deckerben.explainer.autos.Motorrad;

public class Garage {
	
	//Fields
	private final Haus2 dasHaus;
	
	private Motorrad motor1, motor2;
	//== private Motorrad motor2;
	
	private Auto auto1;
	
	//Constructor
	public Garage(Haus2 dasHaus, Motorrad motor1, Motorrad motor2){
		this.dasHaus = dasHaus;
		this.motor1 = motor1;
		this.motor2 = motor2;
		this.auto1 = null;
	}
	
	public Garage(Haus2 dasHaus, Auto auto1){
		this.dasHaus = dasHaus;
		this.motor1 = null;
		this.motor2 = null;
		this.auto1 = auto1;
	}
	
	public Garage(Haus2 dasHaus){
		this.dasHaus = dasHaus;
		this.motor1 = null;
		this.motor2 = null;
		this.auto1 = null;
	}
	
	//Methods
	public boolean eingang(Auto eingangsAuto){
		if (getGeparkt() == 0) {
			auto1 = eingangsAuto;
			return true;
		}
		return false;
	}
	
	public boolean eingang(Motorrad rad){
		if (auto1 != null){
			return false;
		}
		if (getGeparkt() > 1){
			return false;
		}
		if (motor1 == null){
			motor1 = rad;
			return true;
		}
		motor2 = rad;
		return true;
	}
	
	public LandFahrzeug ausgang(){
		if (auto1 == null && motor1 == null && motor2 == null) {
			return null;
		}
		LandFahrzeug ausparkendes = null;
		if (auto1 == null) {
			if (motor2 == null) {
				ausparkendes = motor1; //Zwischenspeichern
				motor1 = null; //Parkplatz frei machen
				return ausparkendes; //Motorrad ausgeparkt
			}
			ausparkendes = motor2; //Zwischenspeichern
			motor2 = null; //Parkplatz frei machen
			return ausparkendes; //Motorrad ausgeparkt
		}
		ausparkendes = auto1; //Zwischenspeichern
		auto1 = null; //Parkplatz frei machen
		return ausparkendes; //Auto ausgeparkt
	}
	
	//Getter
	public int getGeparkt(){
		int zaehler = 0;
		if (motor1 != null) {
			zaehler = zaehler + 1;
		}
		if (motor2 != null) {
			zaehler = zaehler + 1;
		}
		if (auto1 != null) {
			zaehler = zaehler + 1;
		}
		return zaehler;
	}
	
	public Haus2 getHaus(){
		return dasHaus;
	}
	
	//Setter
	
	//Overrides from
	////<class>
	
}
