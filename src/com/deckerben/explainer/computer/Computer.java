/**
 * ZU DIESER DATEI:
 * Diese Datei dient als Erklärung des Syntaxes von Java.
 * Hinter dem Stichwort "Aufbau: " folgt immer der Aufbau des beschriebenen Elements.
 * Darunter steht, welche Werte an welcher Stelle stehen dürfen.
 */
package com.deckerben.explainer.computer;

/**
 * Aufbau: Sichtbarkeit class Klassenname
 *
 * Sichtbarkeit: Entweder private, protected oder public
 * class: class
 * Klassenname: Name der Klasse. Muss in einer Datei einzigartig sein
 */
public class Computer {
	
	/**
	 * Aufbau: Sichtbarkeit Typ Feldname
	 *
	 * Sichtbarkeit: Entweder private, protected oder public
	 * Typ: Ein Typ. Kann primitiv oder Klasse sein
	 * Feldname: Name des Feldes. Muss in einer Klasse einzigartig sein
	 *
	 * In diesem Stil der Deklaration wurde das Feld noch nicht initialisiert. Dies kann zu Problemen führen, weswegen ich empfehle,
	 * entweder den zweiten Stil zu verwenden oder Sicherzustellen, dass das Feld in einem Konstruktor initialisiert wird.
	 */
	private Object feld1;
	
	/**
	 * Aufbau: Sichtbarkeit Typ Feldname = Wert
	 *
	 * Sichtbarkeit: Entweder private, protected oder public
	 * Typ: Ein Typ. Kann primitiv oder Klasse sein
	 * Feldname: Name des Feldes. Muss in einer Klasse einzigartig sein
	 * =: = (Zuweisungsoperator)
	 * Wert: Wert, der dem Feld zugewiesen wird. Handelt es sich bei "Typ" um eine Klasse, darf hier auch das Wort "null" stehen
	 */
	private Object feld2 = new Object();
	
	/**
	 * Es folgen alle primitiven Datentypen mit ihren zugelassenen Werten.
	 */
	
	/**
	 * Wahr (true) oder falsch (false)
	 */
	private boolean wahrFalsch = false;
	
	/**
	 * Minimum: -128
	 * Maximum: 127
	 */
	private byte kleinsteGanzZahl = 0;
	
	/**
	 * Minimum: -32768
	 * Maximum: 32767
	 */
	private short kleineGanzZahl = 0;
	
	/**
	 * Minimum: -2147483648
	 * Maximum: 2147483647
	 */
	private int ganzZahl = 0;
	
	/**
	 * Minimum: -9223372036854775808
	 * Maximum: 9223372036854775807
	 */
	private long grosseGanzZahl = 0;
	
	/**
	 * Minimum: 4E-45 (-4[45 Nullen].0)
	 * Maximum: 4028235E38 (4028235[38 Nullen].0)
	 */
	private float kleineKommaZahl = 0.0f;
	
	/**
	 * Minimum: 9E-324 (-9[324 Nullen].0)
	 * Maximum: 7976931348623157E308 (7976931348623157[308 Nullen].0)
	 */
	private double grosseKommaZahl = 0.0;
	
	/**
	 * Genau ein Zeichen. (Text)
	 */
	private char einZeichen = 'A';
	
	/**
	 * Ende der primitiven Datentypen.
	 * String ist KEIN primitiver Datentyp, String ist eine KLASSE.
	 */
	
	/**
	 * viele Zeichen, auch genannt: Fließtext.
	 */
	private String text = "Ein Text! :)";
	
	/**
	 * Aufbau: Sichtbarkeit Rückgabetyp Name (Parameterliste) {Körper}
	 *
	 * Sichtbarkeit: Entweder private, protected oder public
	 * Rückgabetyp: Ein Typ. Kann primitiv, Klasse oder void sein
	 * Name: Name der Methode
	 * Parameterliste: Kann leer sein oder Parameter enthalten. Parameter durch ',' getrennt
	 * Körper: Hier schreibst du deinen Code rein
	 *
	 *
	 * Aufbau Parameter: Typ Parametername
	 *
	 * Typ: Ein Typ. Kann primitiv oder Klasse sein
	 * Parametername: Name des Parameters. Muss in einer Methode einzigartig sein
	 *
	 *
	 * Zu void:
	 * Diese Methode erwartet keinen Rückgabewert. "return" KANN, MUSS aber NICHT geschrieben werden.
	 * wird "return" geschrieben, muss dahinter kein Wert folgen. (Bsp.: "return;")
	 */
	private void voidMethode(){
	
	}
	
	/**
	 * Eine Methode mit dem primitiven Rückgabetyp "int".
	 * Hier wird "return" zwingend benötigt. nach "return" muss ein zum Rückgabetyp passender Wert stehen.
	 * (Bsp.: "return 628;")
	 */
	private int intMethode(){
		return 895473;
	}
	
	/**
	 * Eine Methode mit dem primitiven Rückgabetyp "Object".
	 * Hier wird "return" zwingend benötigt. nach "return" muss ein zum Rückgabetyp passender Wert stehen.
	 * (Bsp.: "return null;")
	 */
	private Object objectMethode(){
		return new Object();
	}
	
	/**
	 * Eine Methode mit einer Nicht-leeren Parameterliste.
	 */
	private void voidMethodeMitListe(int parameter1, int parameter2, String parameter3, Object parameter4){
	
	}
	
	/**
	 * Eine Methode mit einem bereits verwendeten Namen aber einer anderen Parameterliste, und somit einer einzigartigen Signatur.
	 */
	private void voidMethodeMitListe(int parameter1, int parameter2, String parameter3){
	
	}
	
	/**
	 * Eine Methode mit einem bereits verwendeten Namen aber einer anderen Parameterliste, und somit einer einzigartigen Signatur.
	 * In dieser Methode steht auch Beispielcode.
	 */
	private void voidMethodeMitListe(int parameter1){
		String hallo = "Hallo ich bin ein text";
		Object ob = new Object();
		int zahl = 3;
		voidMethodeMitListe(zahl,zahl + 8,hallo,ob);
	}
	
	/**
	 * Eine Methode, in der Variablen deklariert wurden.
	 *
	 * Aufbau Variablendeklaration: Typ Variablenname
	 *
	 * Typ: Ein Typ. Kann primitiv oder Klasse sein
	 * Variablenname: Name der Variable. Muss in einer Methode einzigartig sein
	 *
	 *
	 * In diesem Stil der Deklaration wurde die Variable noch nicht initialisiert. Dies kann zu Problemen führen, weswegen ich empfehle,
	 * entweder den zweiten Stil zu verwenden oder Sicherzustellen, dass die Variable initialisiert wird, bevor sie gelesen wird.
	 *
	 *
	 * Aufbau Variablendeklaration: Typ Variablenname = Wert
	 *
	 * Typ: Ein Typ. Kann primitiv oder Klasse sein
	 * Variablenname: Name der Variable. Muss in einer Methode einzigartig sein
	 * =: = (zuweisungsoperator)
	 * Wert: Wert, der dem Feld zugewiesen wird. Handelt es sich bei "Typ" um eine Klasse, darf hier auch das Wort "null" stehen
	 */
	private void voidMethodeMitVariable(){
		int var1;
		var1 = 7836;
		byte var2 = 67;
		String var3 = "Hi!";
		Object var4 = null;
		Object var5 = new Object();
	}
	
	/**
	 * Ein Konstruktor.
	 * Aufbau: Sichtbarkeit Typ (Parameterliste) {Körper}
	 *
	 * Sichtbarkeit: Entweder private, protected oder public
	 * Typ: Die Klasse, in der der Konstruktor geschrieben ist. Hier: "Computer"
	 * Parameterliste: Kann leer sein oder Parameter enthalten. Parameter durch ',' getrennt
	 * Körper: Hier schreibst du deinen Code rein
	 */
	private Computer(){
	
	}
	
	/**
	 * Ein Konstruktor mit einer Nicht-leeren Parameterliste
	 */
	private Computer(int parameter1, int parameter2, String parameter3, Object parameter4){
	
	}
	
	/**
	 * Ein weiterer Konstruktor mit einer anderen, Nicht-leeren Parameterliste, und somit einer einzigartigen Signatur.
	 */
	private Computer(int parameter1, int parameter2, String parameter3){
	
	}
	
}

/**
 * Ein kleines Vokabelbuch: (nicht vollständig, ich will auch schlafen!)
 * (Typ) Fachwort: Erklärung
 * Typ: Um welche Art von Fachwort es sich handelt. Typen sind: "Wort", "Keyword", "Unterscheidung".
 * Zu Keyword: Dieses Wort wird genau so im Code geschrieben. Diese Worte können zu nichts anderem benutzt werden (z.B.: Es kann keine Variable namens "this" geben, da "this" ein Keyword ist.)
 *
 * (Wort) Deklaration: Das Element ist jetzt definiert und dem Compiler bekannt. ("Es ist jetzt angemeldet") Analogie Hotel: "Es wurde ein Zimmer gebucht, es ist noch keiner im Zimmer."
 * (Wort) Initialisierung: Das Element hat jetzt einen Wert und ist funktionionsfähig. Analogie Hotel: "In das gebuchte Zimmer ist jetzt der buchende eingezogen."
 * (Wort) Variable: Ein adressierbarer Platz im Speicher.
 * (Wort) Feld: Ein adressierbarer Platz im Speicher.
 * (Wort) Parameter: Ein adressierbarer Platz im Speicher.
 * (Keyword) this: Eine Referenz zu dem aktuellen Element.
 * (Unterscheidung) Variable Vs. Parameter Vs. Feld:
 * 					Diese Worte scheinen alle das gleiche zu beschreiben, und technisch tun sie das auch. Damit man sich aber verwirrungsfreier Unterhalten kann, ist
 * 					* eine Variable ein gespeicherter Wert in einem Körper eines Konstruktors oder einer Methode.
 * 					* ein Feld ein gespeicherter Wert im Körper einer Klasse versehen mit einer Sichtbarkeit. Felder können auch ohne Methoden existieren.
 * 					* ein Parameter ein adressierbarer Wert, geschrieben in einer Parameterliste.
 * //TODO Fortsetzung folgt mit den Sichtbarkeiten usw.
 */
