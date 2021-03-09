package assignment3;

import java.awt.*;
/** This class creates a bar
 * beneath the value and a marked
 * on the value once it is created
 * and draws a line connecting each value*/

public class BarPlot extends Drawable {

    public void draw(Graphics g) {
        /** Bar method */
        g.setColor(Color.LIGHT_GRAY);
        for (int iterator = 0; iterator < value.size()-1; iterator++)
        {
            g.fillRect((iterator*30)-5, (value.get(iterator))-5, 10, 500);
        }
        super.draw(g);

        /** Dot Method*/
        g.setColor(Color.BLACK); //Draws the dot
        for (int iterator = 0; iterator < value.size() - 1; iterator++) {
            g.fillRect((iterator * 30) - 5, (value.get(iterator)) - 5, 10, 10);
        }
        super.draw(g);

        /** Line method */
        if (value.size() == 1) //Draw the line
        {
            g.drawLine(0, 0, 0, value.get(0));
        } else {
            for (int iterator = 0; iterator < value.size() - 1; iterator++) {

                g.drawLine((30 * iterator), (value.get(iterator)), 30 * (iterator + 1), (value.get(iterator + 1)));

            }
        }
    }
}
