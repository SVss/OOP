package Instruments.DrawTools;

import Instruments.DrawPanel;
import Instruments.MouseListeners.LineMouseListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LineDrawTool extends ShapeDrawTool {
    public LineDrawTool(DrawPanel drawer) {
        super(drawer, "Line");

        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawer.setMouseListener(new LineMouseListener(drawer) );
                drawer.setCurrentShapeName(getShapeName());
            }
        });
    }
}
