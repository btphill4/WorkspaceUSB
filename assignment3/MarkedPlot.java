package assignment3;

import java.awt.*;
/** Creates a mark on each value when it is created
 * and forms the line between each value */
public class MarkedPlot extends Drawable {

    public void draw(Graphics g) {
        /** dot method */
        g.setColor(Color.BLACK);
        for (int iterator = 0; iterator < value.size() - 1; iterator++) {
            g.fillRect((iterator * 30) - 5, (value.get(iterator)) - 5, 10, 10);
        }
        super.draw(g);

        /** Draws the line from each value*/
        if (value.size() == 1) {
            g.drawLine(0, 0, 0, value.get(0));
        } else {
            for (int iterator = 0; iterator < value.size() - 1; iterator++) {
                g.drawLine((30 * iterator), value.get(iterator), 30 * (iterator + 1), (value.get(iterator + 1)));
            }
        }
    }
}
