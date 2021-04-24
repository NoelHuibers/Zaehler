package com.company;

import javax.swing.*;

/**
 * Die Klasse GUI extends JFrame und ist ein GUI zum Erstellen eines Zählers. Es öffnet sich beim Start des Programmes.
 *
 * @author Noel Huibers, Jan Reuter, Boris Hyacinte Kemadjou Djeunou
 * @version 0.0.1
 */
public class GUI extends JFrame {

    private JComboBox<CountingObject> countingObject;

    /**
     * Diese ist der Konstruktor der Klasse GUI. Diese Funktion wird beim initalisieren des Objekts ausgeführt.
     * @ensures GUI.init();
     */
    public GUI(){
        window();
        confirmButton();
        selectObject();
    }

    /**
     * Diese ist die Methode window. Sie erstellt ein normales Fenster mit der Abmessungen 480x800.
     * @ensures window.init();
     */
    public void window(){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Diese ist die Methode selectObject. Sie erstellt eine JComboBox, mit welchem man das zu zählende Objekt einstellen kann.
     * @requires window.init();
     * @ensures countingObject.revalidate();
     * @ensures countinObject.repaint();
     */
    private void selectObject(){
        countingObject = new JComboBox<>(CountingObject.values());
        countingObject.setBounds(160, 120, 80, 40);
        countingObject.setSize(80, 40);

        add (countingObject);
        countingObject.revalidate();
        countingObject.repaint();
    }

    /**
     * Diese ist die Methode confirmButton. Mit diesem Button erstellt man das gewünschte Objekt der Klasse Counter, schließt dieses GUI und öffnet GUI2.
     * @requires window.init();
     * @ensures confirmButton.init();
     * @ensures if JButton.pressed() => new GUI2(counter);
     * @ensures if JButton.pressed() => super.dispose();
     */
    private void confirmButton(){
        JButton confirm = new JButton("Confirm");
        confirm.setBounds(130,625,150,50);
        confirm.setSize(150,50);
        confirm.addActionListener(e ->
        {
            Counter counter = new Counter((CountingObject) countingObject.getSelectedItem());
            new GUI2(counter);
            super.dispose();
        });
        add (confirm);
    }
}
