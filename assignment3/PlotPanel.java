package assignment3;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java.awt.*;
/** Creates a PlotPanel type for SimplePlot, MarkedPlot, and BarPlot */
public class PlotPanel extends JPanel implements Observer {
    Drawable drawable;

    public PlotPanel(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void update(Observable o, Object arg) {
    drawable.setValue(((Source)o).getValue());
    repaint();
    }

    public void paintComponent(Graphics g){
        if(drawable != null)
            drawable.draw(g);
    }
}
