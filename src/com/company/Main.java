package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Zähler zaehler = new Zähler();
        JFrame gui = new GUI(zaehler);
    }
}
