package Instruments.DrawTools;

import Instruments.DrawPanel;
import Instruments.MouseListeners.PolygonMouseListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PolygonDrawTool extends ShapeDrawTool {
    public PolygonDrawTool(final DrawPanel drawer) {
        super(drawer, "Polygon");

        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawer.setMouseListener(new PolygonMouseListener(drawer) );
                drawer.setCurrentShapeName(getShapeName());
            }
        });
    }
}
