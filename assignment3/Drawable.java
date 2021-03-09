package assignment3;

import java.awt.*;
import java.util.LinkedList;

public abstract class Drawable {
    Source source = new Source();

    /** Hold the values as they are created */
    LinkedList<Integer> value = new LinkedList<Integer>();

    /** add value method */
    public void setValue(int v){
        value.add(v);
    }

    public void draw(Graphics G){

    }
}
