# Aufgabe 2
*Ziel*: Ein hochhaus hat midestens 20 Etagen und eine Garage.
## Vorgehensweise:
Ein Hochhaus ist ein Haus2.
### Zu Speichern
1. final Garage tiefGarage
### Funktionen
* getGarage()
* setEtagen(int) (Siehe Anmerkung 1)
* abreissen(boolean) (Siehe Anmerkung 2)
* sayGarage() (Siehe Anmerkung 3)
### Anmerkung
1. Ist der Eingabewert kleiner als 20, passiert nichts. Ansonsten wird etagen = Eingabewert.
2. Zusätzlich muss tiefGarage leer sein (siehe **super.abreissen(boolen)**)
3. Ist tiefGarage leer, wird "Tiefgarage ist leer" ausgegeben. ansonsten wird "Geparkte Fahrzeuge: *anzahl*" ausgegeben (siehe **Tools.ausgabe(String)**) 