package com.company;

import javax.swing.*;

/**
 * Die Klasse GUI extends JFrame und ist ein GUI zum Erstellen eines Zählers. Es öffnet sich beim Start des Programmes.
 *
 * @author Noel Huibers, Jan Reuter, Boris Hyacinte Kemadjou Djeunou
 * @version 0.0.1
 */
public class GUI extends JFrame {

    //Class variables
    private JComboBox<CountingObject> countingObject;

    /**
     * Diese ist der Konstruktor der Klasse GUI. Diese Funktion wird beim initalisieren des Objekts ausgeführt.
     *
     * @ensures GUI.init();
     */
    public GUI(Database database) {
        window();
        confirmButton(database);
        selectObject();
    }

    /**
     * Diese ist die Methode window. Sie erstellt ein normales Fenster mit der Abmessungen 480x800.
     *
     * @ensures window.init();
     */
    public void window() {
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Diese ist die Methode selectObject. Sie erstellt eine JComboBox, mit welchem man das zu zählende Objekt einstellen kann.
     *
     * @requires window.init();
     * @ensures countingObject.revalidate();
     * @ensures countinObject.repaint();
     */
    private void selectObject() {
        countingObject = new JComboBox<>(CountingObject.values());
        countingObject.setBounds(160, 120, 80, 40);
        countingObject.setSize(80, 40);
        add(countingObject);
        countingObject.revalidate();
        countingObject.repaint();
    }

    /**
     * Diese ist die Methode confirmButton. Mit diesem Button erstellt man das gewünschte Objekt der Klasse Counter, schließt dieses GUI und öffnet GUI2.
     *
     * @requires window.init();
     * @ensures confirmButton.init();
     * @ensures if JButton.pressed() => new GUI2(counter);
     * @ensures if JButton.pressed() => super.dispose();
     */
    //Will get changed to addButton to add new Counters.
    private void confirmButton(Database database) {
        JButton confirm = new JButton("Confirm");
        confirm.setBounds(130, 625, 150, 50);
        confirm.setSize(150, 50);
        confirm.addActionListener(e ->
        {
            Counter counter = new Counter((CountingObject) countingObject.getSelectedItem());
            new GUI2(counter, database);
            //database.add(counter);
            super.dispose();
        });
        add(confirm);
    }

    //This is to choose from stored Counters from the Database again. Every Counter should get a button on their own.
    //So a buttonlayout is needed and an @Override so that it can be initalized more often.
    //For now its only to select for testing purposes.
    private void useCounter(Database database){
        //JComboBox useCounter = new JComboBox<CountingObject>(database.getAllCounterObjects());
        //useCounter.setBounds(300, 120, 80, 40);
        // useCounter.setSize(80, 40);
        //add(useCounter);
        //useCounter.revalidate();
        //useCounter.repaint();
    }

    //For testing purposes to confirm the Counter that already been init to reuse from the Database
    //Could get merged with confirmButton1 by an if clausel later.
    private void confirmButton2(Database database){
        JButton accept = new JButton("Confirm");
        accept.setBounds(130, 625, 150, 50);
        accept.setSize(150, 50);
        accept.addActionListener(e ->
        {
            Counter counter = new Counter((CountingObject) countingObject.getSelectedItem());
            new GUI2(counter, database);
            //database.add(counter);
            super.dispose();
        });
        add(accept);
    }
}
