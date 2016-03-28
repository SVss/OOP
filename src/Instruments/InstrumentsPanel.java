package Instruments;

import Instruments.DrawTools.*;
import Instruments.Shapes.Point;
import Instruments.Shapes.PolyLine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstrumentsPanel extends JPanel {
    private JButton buttonUndo = new JButton("Undo");
    private JButton buttonClear = new JButton("Clear");

    public InstrumentsPanel(DrawPanel d) {

        buttonUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.removeLastShape();
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.clearShapes();
            }
        });

        this.add(new JLabel("Instruments"));

        this.add(new LineDrawTool(d).getButton());          // Line
        this.add(new RectangleDrawTool(d).getButton() );    // Rectangle
        this.add(new EllipseDrawTool(d).getButton() );      // Ellipse
        this.add(new CircleDrawTool(d).getButton() );       // Circle
        this.add(new PolyLineDrawTool(d).getButton() );     // PolyLine
/*
        PolyLine pl = new PolyLine();
        pl.addPoint(new Point(10, 10) );
        pl.addPoint(new Point(20, 10) );
        pl.addPoint(new Point(20, 30) );
        pl.addPoint(new Point(40, 30) );

        d.addShape(pl);
*/
        this.add(buttonUndo);
        this.add(buttonClear);
    }
}
