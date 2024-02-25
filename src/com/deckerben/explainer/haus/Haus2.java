package com.deckerben.explainer.haus;

import static com.deckerben.explainer.Tools.ausgabe;

public class Haus2 {
	
	private int etagen = 0;
	
	public Haus2(){
		etagen = 0;
	}
	
	public Haus2(int startEtagen) {
		setEtagen(startEtagen);
	}
	
	public int getEtagen(){
		return etagen;
	}
	
	public String sayEtagen(){
		if (etagen == 0){
			return "Nur Erdgeschoss";
		}
		return "Etagen: "+ etagen;
	}
	
	public void setEtagen(int neueEtagen){
		if (neueEtagen < 1 || neueEtagen > 20){
			return;
		}
		etagen = neueEtagen;
	}
	
	public void abreissen(boolean erlaubt){
		if (erlaubt && etagen > 0) {
			ausgabe("Wird abgerissen...");
			etagen = 0;
		} else {
			if (erlaubt){
				ausgabe("Nur Erdgeschoss. Kann nichts abreißen.");
			} else {
				ausgabe("Keine Abrisserlaubnis erteilt!");
			}
		}
	}
}
