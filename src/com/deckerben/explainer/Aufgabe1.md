# Aufgabe 1
*Ziel:* Eine Garage, in der entweder 2 Motorräder oder 1 Auto geparkt werden können. Die Garage ist einem Haus2 zugeordnet.

## Vorgehensweise:
### Zu Speichern:
1. Haus2 dasHaus
2. Motorrad motor1
3. Motorrad motor2
4. Auto auto1

### Konstruktoren:
* Garage(Haus2)
* Garage(Haus2, Auto)
* Garage(Haus2, Motorrad, Motorrad)

### Funktionen:
* eingang(Auto): boolean
* eingang(Motorrad): boolean
* getGeparkt(): int
* getHaus(): Haus2
* ausgang(): Landfahrzeug
