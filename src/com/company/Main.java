package com.company;

public class Main {

    /**
     ** Diese Funktion ist die Main Methode des Projekts. Diese führt das Programm aus, indem es sowohl einen Zähler initalisiert als auch ein GUI in welchem man den Zähler nutzt.
     ** @ensures zaehler.init();
     ** @ensures gui.init();
     **/
    public static void main(String[] args) {
        Zaehler zaehler = new Zaehler(Zaehlungsobjekt.VOEGEL);
        new GUI(zaehler);
    }
}
