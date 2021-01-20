package assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class World extends JFrame implements ActionListener {
    Source source = new Source();
    private PlotPanel plotPanel;

    /** World Constructor
     * Creates panels, plots and
     * a button to add values each time
     * it is pressed*/
    public World() {

        /** Panel Creation */
        setLayout(new GridLayout(4, 1));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(0,0,0));

        /** Button Creation*/
        JButton runButton = new JButton("Run");
        runButton.addActionListener(this);

        /** Plot creation for the 3 types of plots*/
        SimplePlot simplePlot = new SimplePlot();
        MarkedPlot markedPlot = new MarkedPlot();
        BarPlot barPlot = new BarPlot();

        /** PlotPanel types creation */
        PlotPanel barPanel = new PlotPanel(barPlot);
        PlotPanel markedPanel = new PlotPanel(markedPlot);
        PlotPanel simplePanel = new PlotPanel(simplePlot);

        source.addObserver(simplePanel);
        source.addObserver(markedPanel);
        source.addObserver(barPanel);

        markedPanel.add(simplePanel);
        barPanel.add(markedPanel);

        /** Adds each panel to the gui and run button */
        add(barPanel);
        add(markedPanel);
        add(simplePanel);
        add(runButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        source.create();
        repaint();

    }

    /** Main method, cronfigured world */
    public static void main(String[] args){
        assignment3.World world = new assignment3.World();
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        world.setSize(800,1000);
        world.setVisible(true);
    }

}
