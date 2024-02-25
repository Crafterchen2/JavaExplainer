package com.deckerben.explainer.autos;

public class Hubschrauber extends LuftFahrzeug{
	
	private final HubschrauberArt art;
	
	public Hubschrauber(String dasKennzeichen) {
		this(dasKennzeichen, HubschrauberArt.NORMAL);
	}
	
	public Hubschrauber(String dasKennzeichen, HubschrauberArt dieArt){
		super(dasKennzeichen);
		art = dieArt;
	}
	
	public HubschrauberArt getArt(){
	    return art;
	}
	
	public enum HubschrauberArt{
		NORMAL,
		DRONE,
		CARGO
	}
	
}
