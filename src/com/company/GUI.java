package com.company;

import javax.swing.*;

public class GUI extends JFrame {

    private JComboBox<CountingObject> countingObject;

    public GUI(){
        window();
        confirmButton();
        selectObject();

    }

    public void window(){
        setLayout(null);
        setVisible(true);
        setSize(480, 800);
        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void selectObject(){
        countingObject = new JComboBox<>(CountingObject.values());
        countingObject.setBounds(160, 120, 80, 40);
        countingObject.setSize(80, 40);

        add (countingObject);
        countingObject.revalidate();
        countingObject.repaint();
    }

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
