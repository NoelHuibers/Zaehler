package com.company;

import java.util.LinkedList;
import java.util.Iterator;

/**
 * Die Klasse Database ist die Datenbank, in  welcher die Zähler und Einstellungen der Zähler gespeichert werden.
 *
 * @author Noel Huibers, Jan Reuter, Boris Hyacinte Kemadjou Djeunou
 * @version 0.0.1
 */
public class Database {

    //Class variables
    public static LinkedList<Counter> ids;

    public void Database(){
        ids = new LinkedList<>();
    }

    public void add(Counter counter){
        ids.add(counter.id, counter);
    }

    public void remove(Counter counter){
        ids.remove(counter.id);
    }

    public void save(Counter counter){
        ids.add(counter.id, counter);
    }

    public int loadNumber(Counter counter){
        int number = counter.getNumber();
        return number;
    }

    public void hardReset() {
        ids.clear();
    }

    //Funktioniert noch nicht
    //public CountingObject getAllCounterObjects(){
    //    for (int i = 1; i < ids.size(); i++) {
    //        Counter counter = ids.get(i);
    //       return counter.name;
    //   }
    //   Counter counter1 = ids.get(1);
    //   return counter1.name;
    //}
}
