package com.company;

import javax.swing.*;

public class GUI extends JFrame {
    JLabel zahl;
    JButton hoch;
    JButton runter;

    public GUI(Zähler zähler){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Zähler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        zahl = new JLabel(String.valueOf(zähler.zahl));
        zahl.setBounds(230, 600,100, 100);
        add (zahl);
        hoch = new JButton("+");
        hoch.setBounds(270,625,10,10);
        hoch.setSize(50,50);
        hoch.addActionListener(e ->
        {
            zähler.hochzaehlen();
            zahl.setText(String.valueOf(zähler.zahl));
        });
        add (hoch);
        runter = new JButton("-");
        runter.setBounds(150,625,10,10);
        runter.setSize(50,50);
        runter.addActionListener(e ->
        {
            zähler.runterzaehlen();
            zahl.setText(String.valueOf(zähler.zahl));
        });
        add (runter);
    }
}
