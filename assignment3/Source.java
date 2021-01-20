package assignment3;

import java.util.Observable;
/** Creates the value using a random number
 * generator*/
public class Source extends Observable {
    private int value;

    /** creates a variable using Math from 0 to 250 and notifies
     * the observer*/
    public void create(){
        value = (int) (Math.random() * 250);
        setChanged();
        notifyObservers();
    }

    /** returns the value created*/
    public int getValue(){
        return value;
    }

}
