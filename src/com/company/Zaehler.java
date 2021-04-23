package com.company;

public class Zaehler {

    //Klassenvariablen
    int zahl = 0;
    int schrittZahl = 1;
    Zaehlungsobjekt name;

    /**
     ** Diese ist der Konstruktor der Klasse Zähler. Diese Funktion wird beim erstellen des Objekts ausgeführt und setzt den Namen des Objekts, welches gezählt wird.
     ** @param name;
     ** @ensures this.name = name;
     **/
    public Zaehler(Zaehlungsobjekt name){
        this.name = name;
    }

    /**
     ** Diese Funktion dient zum hochzählen des Zählers. Es wird von der Variable "zahl" die Schrittzahl hinzugerechnet.
     ** @requires schrittzahl!=0;
     ** @ensures this.zahl=+schrittZahl;
     **/
    public void hochzaehlen() {
        this.zahl+=schrittZahl;
    }

    /**
     ** Diese Funktion dient zum runterzählen des Zählers. Es wird von der Variable "zahl" die Schrittzahl abgezogen.
     ** @requires schrittzahl!=0;
     ** @ensures this.zahl=-schrittZahl;
     **/
    public void runterzaehlen() {
        this.zahl-=schrittZahl;
    }

    /**
     ** Diese Funktion dient zum resetten des Zählers. Die Variable "zahl" wird also auf 0 gesetzt.
     ** @ensures this.zahl=0;
     **/
    public void reset() {
        this.zahl=0;
    }


    /**
     ** Diese Funktion ist die getter-Methode der Klassenvariable "schrittzahl". Dies gibt die zurzeitige Schrittzahl des Zählers zurück.
     ** @return schrittZahl;
     **/
    public int getSchrittzahl() {
        return schrittZahl;
    }

    /**
     ** Diese Funktion ist die setter-Methode der Klassenvariable "schrittzahl". Dies setzt den Schrittzähler des Zählers.
     ** @param zahl;
     ** @requires zahl!=0;
     ** @ensures this.schrittZahl=zahl;
     **/
    public void setSchrittzahl(int zahl) {
        this.schrittZahl=zahl;
    }

    /**
     ** Diese Funktion ist die getter-Methode der Klassenvariable "zahl". Dies gibt die zurzeitige Zahl des Zählers zurück.
     ** @return zahl;
     **/
    public int getZahl() {
        return zahl;
    }

    /**
     ** Diese Funktion ist die setter-Methode der Klassenvariable "zahl". Dies setzt die Zahl des Zählers auf einen beliebigen Wert.
     ** @param zahl;
     ** @ensures this.zahl=zahl;
     **/
    public void setZahl(int zahl) {
        this.zahl=zahl;
    }

}
