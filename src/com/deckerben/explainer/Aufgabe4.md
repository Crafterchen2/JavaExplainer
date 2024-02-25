# Aufgabe 4 (unfertig, schwer)
*Ziel*: Ein Vtol ist ein Flugzeug, das wie Helikopter startet und wie ein Flugzeug fliegt.
Immer wenn es schneller als 100 Km/h ist, ist es im Flugzeugmodus.
Ist es gelandet, kann es nicht schneller als 10 km/h sein.
Da Vtols so besonders sind, müssen ihre Kennzeichen mit "Vtol: " beginnen.
## Vorgehensweise:
Ein Vtol ist ein Luftfahrzeug.
### Zu Speichern:
1. String pilotName
2. double geschwindigkeit
3. boolean istGelandet
### Konstruktoren
* Vtol(String, String)
### Funktionen
* getPilotName(): String
* getGeschwindigkeit(): double
* getModus(): byte (Siehe Anmerkung 1)
* beschleunige(double) (Siehe Anmerkung 2)
* bremsen(double) (Siehe Anmerkung 3)
* abheben(): boolean (Siehe Anmerkung 4)
* landen(): boolean (Siehe Anmerkung 5)
* handbremse(): boolean (Siehe Anmerkung 6)
### Anmerkungen
1. Gebe 0 zurück, wenn das Vtol gelandet ist, gebe 1 zurück, wenn das Vtol im Flugzeugmodus ist und gebe 2 zurück, wenn das Vtol im Helikoptermodus ist.
2. Es sind nur positive Eingabewerte erlaubt. wird eine ungültige Zahl eingeben, passiert nichts. Ist die Geschwindigkeit größer als 0, wird von der Geschwindigkeit die hälfte des eingabewertes addiert, ansonsten wird die hälfte des Eingabewertes abgezogen.
3. Es sind nur positive Eingabewerte erlaubt, die kleiner sind als die aktuelle, absolute Geschwindigkeit (Siehe **Math.abs(double): double**). wird eine ungültige Zahl eingeben, passiert nichts. Ist die Geschwindigkeit größer als 0, wird von der Geschwindigkeit die hälfte des eingabewertes abgezogen, ansonsten wird die hälfte des Eingabewertes addiert.
4. Das Vtol muss gelandet sein, um abheben zu können. damit es abheben darf, muss die Geschwindigkeit == 0 sein.
5. Das Vtol darf nicht gelandet sein, um landen zu können. damit es landen darf, muss die absolute Geschwindigkeit (Siehe **Math.abs(double): double**) kleiner als 5 Km/h sein.