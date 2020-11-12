package assignment3;

import java.awt.*;
/** Class creates a line that connects
 * each value when it is created*/

public class SimplePlot extends Drawable {

    public void draw(Graphics g) {
        /** Line method */
        g.setColor(Color.BLACK);
        if(value.size() == 1)
        {
            g.drawLine(0,0,0,value.get(0));
        }
        else {
            for (int iterator = 0; iterator < value.size() - 1; iterator++) {
                g.drawLine((30 * iterator), (value.get(iterator)), 30 * (iterator + 1), (value.get(iterator + 1)));
                //g.drawLine(0, 10,0, 10);
            }
        }
    }

}
