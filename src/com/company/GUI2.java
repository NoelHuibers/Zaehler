package com.company;

import javax.swing.*;

public class GUI2 extends JFrame {

    //Class variables
    private JLabel number;

    /**
     ** Diese ist der Konstruktor der Klasse GUI. Diese Funktion wird beim erstellen des Objekts ausgeführt.
     ** @param counter;
     ** @ensures GUI2.init();
     **/
    public GUI2(Counter counter){
        window();
        name(counter);
        number(counter);
        plusButton(counter);
        minusButton(counter);
        stepCount(counter);
    }

    /**
     ** Diese ist die Methode window. Sie erstellt ein normales Fenster mit der Abmessungen 480x800.
     ** @ensures window.init();
     **/
    private void window(){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     ** Diese ist die Methode name. Sie zeigt den Namen des zu zählenden Objekts auf einem Fenster ab.
     ** @param counter;
     ** @requires window.init();
     ** @ensures name.init();
     **/
    private void name(Counter counter){
        JLabel name = new JLabel(String.valueOf(counter.name));
        name.setBounds(230, 300,100, 100);
        add (name);
    }

    /**
     ** Diese ist die Methode zahl. Sie bildet die aktuelle Zahl des zu zählenden Objekts auf einem Fenster ab.
     ** @param counter;
     ** @requires window.init();
     ** @ensures counter.init();
     **/
    private void number(Counter counter){
        number = new JLabel(String.valueOf(counter.number));
        number.setBounds(230, 600,100, 100);
        add (number);
    }

    /**
     ** Diese ist die Methode plusButton. Sie erstellt einen Plusbutton mit welchem man den Zähler hochzählen kann.
     ** @param counter;
     ** @requires window.init();
     ** @ensures plusButton.init();
     ** @ensures if JButton.pressed() => counter.countUp();
     **/
    private void plusButton(Counter counter){
        JButton up = new JButton("+");
        up.setBounds(270,625,10,10);
        up.setSize(50,50);
        up.addActionListener(e ->
        {
            counter.countUp();
            number.setText(String.valueOf(counter.number));
        });
        add (up);
    }

    /**
     ** Diese ist die Methode minusButton. Sie erstellt einen Minusbutton mit welchem man den Zähler runterzählen kann.
     ** @param counter;
     ** @requires window.init();
     ** @ensures minusButton.init();
     ** @ensures if JButton.pressed() => window.countDown();
     **/
    private void minusButton(Counter counter){
        JButton down = new JButton("-");
        down.setBounds(150,625,10,10);
        down.setSize(50,50);
        down.addActionListener(e ->
        {
            counter.countDown();
            number.setText(String.valueOf(counter.number));
        });
        add (down);
    }


    private void stepCount(Counter counter){
        JSpinner stepCount = new JSpinner(new SpinnerNumberModel(counter.stepCount,1,100,1));
        stepCount.setBounds(360, 50,50, 50);
        stepCount.setSize(40, 50);
        stepCount.addChangeListener(e ->
                counter.setStepCount((Integer) stepCount.getValue()));
        add (stepCount);
    }

}
