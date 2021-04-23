package com.company;

public class ZählerMain {

    int zahl = 0;
    int schrittZahl = 1;

    public static void main(String[] args) {

    }

    /**
     ** Diese Funktion dient zum hochzählen des Zählers. Es wird von der Variable "zahl" die Schrittzahl hinzugerechnet.
     ** @requires schrittzahl!=0;
     ** @ensures this.zahl=+schrittZahl;
     **/
    public void hochzählen() {
        this.zahl=+schrittZahl;
    }

    /**
     ** Diese Funktion dient zum runterzählen des Zählers. Es wird von der Variable "zahl" die Schrittzahl abgezogen.
     ** @requires schrittzahl!=0;
     ** @ensures this.zahl=-schrittZahl;
     **/
    public void runterzählen() {
        this.zahl=-schrittZahl;
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
     ** @returns schrittZahl;
     **/
    public int getSchrittzahl() {
        return schrittZahl;
    }

    /**
     ** Diese Funktion ist die setter-Methode der Klassenvariable "schrittzahl". Dies setzt den Schrittzähler des Zählers.
     ** @params int zahl;
     ** @requires zahl!=0;
     ** @ensures this.schrittZahl=zahl;
     **/
    public void setSchrittzahl(int zahl) {
        this.schrittZahl=zahl;
    }

    /**
     ** Diese Funktion ist die getter-Methode der Klassenvariable "zahl". Dies gibt die zurzeitige Zahl des Zählers zurück.
     ** @returns zahl;
     **/
    public int getZahl() {
        return zahl;
    }

    /**
     ** Diese Funktion ist die setter-Methode der Klassenvariable "zahl". Dies setzt die Zahl des Zählers auf einen beliebigen Wert.
     ** @params int zahl;
     ** @ensures this.zahl=zahl;
     **/
    public void setZahl(int zahl) {
        this.zahl=zahl;
    }

}
