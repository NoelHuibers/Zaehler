package com.company;

import javax.swing.*;

public class GUI2 extends JFrame {

    //Klassenvariablen
    private JLabel zahl;

    /**
     ** Diese ist der Konstruktor der Klasse GUI. Diese Funktion wird beim erstellen des Objekts ausgeführt.
     ** @param zaehler;
     ** @ensures gui.init();
     **/
    public GUI2(Zaehler zaehler){
        fenster();
        name(zaehler);
        zahl(zaehler);
        plusButton(zaehler);
        minusButton(zaehler);
        schrittZahl(zaehler);
    }


    /**
     ** Diese ist die Methode fenster. Sie erstellt ein normales Fenster mit der Abmessung 480x800.
     ** @ensures fenster.init();
     **/
    private void fenster(){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Zähler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     ** Diese ist die Methode name. Sie zeigt den Namen des zu zählenden Objekts auf einem Fenster ab.
     ** @param zaehler;
     ** @requires fenster.init();
     ** @ensures name.init();
     **/
    private void name(Zaehler zaehler){
        //Klassenvariablen
        JLabel name = new JLabel(String.valueOf(zaehler.name));
        name.setBounds(230, 300,100, 100);
        add (name);
    }

    /**
     ** Diese ist die Methode zahl. Sie bildet die aktuelle Zahl des zu zählenden Objekts auf einem Fenster ab.
     ** @param zaehler;
     ** @requires fenster.init();
     ** @ensures zahl.init();
     **/
    private void zahl(Zaehler zaehler){
        zahl = new JLabel(String.valueOf(zaehler.zahl));
        zahl.setBounds(230, 600,100, 100);
        add (zahl);
    }

    /**
     ** Diese ist die Methode plusButton. Sie erstellt einen Plusbutton mit welchem man den Zähler hochzählen kann.
     ** @param zaehler;
     ** @requires fenster.init();
     ** @ensures plusButton.init();
     ** @ensures if JButton.pressed() => zähler.hochzaehlen();
     **/
    private void plusButton(Zaehler zaehler){
        JButton hoch = new JButton("+");
        hoch.setBounds(270,625,10,10);
        hoch.setSize(50,50);
        hoch.addActionListener(e ->
        {
            zaehler.hochzaehlen();
            zahl.setText(String.valueOf(zaehler.zahl));
        });
        add (hoch);
    }

    /**
     ** Diese ist die Methode minusButton. Sie erstellt einen Minusbutton mit welchem man den Zähler runterzählen kann.
     ** @param zaehler;
     ** @requires fenster.init();
     ** @ensures minusButton.init();
     ** @ensures if JButton.pressed() => zähler.runterzählen();
     **/
    private void minusButton(Zaehler zaehler){
        JButton runter = new JButton("-");
        runter.setBounds(150,625,10,10);
        runter.setSize(50,50);
        runter.addActionListener(e ->
        {
            zaehler.runterzaehlen();
            zahl.setText(String.valueOf(zaehler.zahl));
        });
        add (runter);
    }

    //Funktioniert noch nicht.
    private void schrittZahl(Zaehler zaehler){
        JSpinner schrittZahl = new JSpinner(new SpinnerNumberModel(zaehler.schrittZahl,1,100,1));
        schrittZahl.setBounds(360, 50,50, 50);
        schrittZahl.setSize(40, 50);
        add (schrittZahl);
    }

}
