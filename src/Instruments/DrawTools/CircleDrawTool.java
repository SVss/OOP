package Instruments.DrawTools;

import Instruments.DrawPanel;
import Instruments.MouseListeners.CircleMouseListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleDrawTool extends ShapeDrawTool {
    public CircleDrawTool(DrawPanel drawer) {
        super(drawer, "Circle");

        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawer.setMouseListener(new CircleMouseListener(drawer) );
                drawer.setCurrentShapeName(getShapeName());
            }
        });
    }
}
