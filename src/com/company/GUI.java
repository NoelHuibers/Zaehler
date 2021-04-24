package com.company;

import javax.swing.*;

public class GUI extends JFrame {

    public boolean zaehlerErstellt;
    private JComboBox zaehlungsObjekt;

    public GUI(){
        fenster();
        zaehlungsObjektauswahl();
        bestaetigenButton();
    }

    public void fenster(){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Zähler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void zaehlungsObjektauswahl(){
        zaehlungsObjekt = new JComboBox<Zaehlungsobjekt>(Zaehlungsobjekt.values());
        zaehlungsObjekt.setBounds(160, 120, 80, 40);
        zaehlungsObjekt.setSize(80, 40);
        add (zaehlungsObjekt);
    }

    private void bestaetigenButton(){
        JButton bestaetigen = new JButton("Bestätigen");
        bestaetigen.setBounds(130,625,150,50);
        bestaetigen.setSize(150,50);
        bestaetigen.addActionListener(e ->
        {
            Zaehler zaehler = new Zaehler((Zaehlungsobjekt) zaehlungsObjekt.getSelectedItem());
            new GUI2(zaehler);

        });
        add (bestaetigen);
    }
}
