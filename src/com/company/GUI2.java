package com.company;

import javax.swing.*;

/**
 * Die Klasse GUI2 extends JFrame und ist ein GUI auf welches GUI2 zugreift. Es ist das HauptGUI für den Zähler.
 *
 * @author Noel Huibers, Jan Reuter, Boris Hyacinte Kemadjou Djeunou
 * @version 0.0.1
 */
public class GUI2 extends JFrame {

    //Class variables
    private JLabel number;

    /**
     * Diese ist der Konstruktor der Klasse GUI. Diese Funktion wird beim initialisieren des Objekts ausgeführt.
     * @param counter;
     * @ensures GUI2.init();
     */
    public GUI2(Counter counter){
        window();
        name(counter);
        number(counter);
        plusButton(counter);
        minusButton(counter);
        stepCount(counter);
        goBackButton();
        resetButton(counter);
    }

    /**
     * Diese ist die Methode window. Sie erstellt ein normales Fenster mit der Abmessungen 480x800.
     * @ensures window.init();
     */
    private void window(){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Diese ist die Methode name. Sie zeigt den Namen des zu zählenden Objekts auf einem Fenster ab.
     * @param counter;
     * @requires window.init();
     * @ensures name.init();
     */
    private void name(Counter counter){
        JLabel name = new JLabel(String.valueOf(counter.name));
        name.setBounds(230, 300,100, 100);
        add (name);
    }

    /**
     * Diese ist die Methode zahl. Sie bildet die aktuelle Zahl des zu zählenden Objekts auf einem Fenster ab.
     * @param counter;
     * @requires window.init();
     * @ensures counter.init();
     */
    private void number(Counter counter){
        number = new JLabel(String.valueOf(counter.number));
        number.setBounds(230, 600,100, 100);
        add (number);
    }

    /**
     * Diese ist die Methode plusButton. Sie erstellt einen Plusbutton mit welchem man den Zähler hochzählen kann.
     * @param counter;
     * @requires window.init();
     * @ensures plusButton.init();
     * @ensures if JButton.pressed() => counter.countUp();
     */
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
     * Diese ist die Methode minusButton. Sie erstellt einen Minusbutton mit welchem man den Zähler runterzählen kann.
     * @param counter;
     * @requires window.init();
     * @ensures minusButton.init();
     * @ensures if JButton.pressed() => window.countDown();
     */
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

    /**
     * Diese ist die Methode stepCount. Sie erstellt einen Spinner, mit welchem man die Schrittzahl einstellen kann.
     * @param counter;
     * @requires window.init();
     * @ensures stepCount.init();
     * @ensures if JSpinner.pressed() => stepCount.getValue();
     */
    private void stepCount(Counter counter){
        JSpinner stepCount = new JSpinner(new SpinnerNumberModel(counter.stepCount,1,100,1));
        stepCount.setBounds(360, 50,50, 50);
        stepCount.setSize(40, 50);
        stepCount.addChangeListener(e ->
                counter.setStepCount((Integer) stepCount.getValue()));
        add (stepCount);
    }

    /**
     * Diese ist die Methode goBackButton. Sie erstellt einen Button um zurück ins erste GUI zu gelangen.
     * @requires window.init();
     * @ensures goBackButton.init();
     * @ensures if JButton.pressed() => super.dispose();
     */
    private void goBackButton(){
        JButton back = new JButton("Back");
        back.setBounds(40,40,150,50);
        back.setSize(150,50);
        back.addActionListener(e ->
        {
            new GUI();
            super.dispose();
        });
        add (back);
    }

    /**
     * Diese ist die Methode resetButton. Sie erstellt einen Button um den Counter auf null zurück zu setzen.
     * @requires window.init();
     * @ensures reset.init();
     * @ensures if JButton.pressed() => counter.reset();
     * @ensures if JButton.pressed() => number.setText(String.valueOf(counter.number));
     */
    private void resetButton(Counter counter){
        JButton reset = new JButton("R");
        reset.setBounds(350,150,150,50);
        reset.setSize(50,50);
        reset.addActionListener(e ->
            {
                counter.reset();
                number.setText(String.valueOf(counter.number));
            });
        add (reset);
    }
}
