package com.company;

/**
 * Die Klasse Main besitzt die Main Methode zum ausführen des Porjekts.
 *
 * @author Noel Huibers, Jan Reuter, Boris Hyacinte Kemadjou Djeunou
 * @version 0.0.1
 */
public class Main {
    //Class varibales

    /**
     * This Method is the Main Methode of the Project. It runs the program by starting the GUI.
     * @ensures gui.init();
     */
    public static void main(String[] args) {
        Database database = new Database();
        new GUI(database);
    }
}
