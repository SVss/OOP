package Instruments.DrawTools;

import Instruments.DrawPanel;
import Instruments.MouseListeners.EllipseMouseListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EllipseDrawTool extends ShapeDrawTool {
    public EllipseDrawTool(final DrawPanel drawer) {
        super(drawer, "Ellipse");

        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawer.setMouseListener(new EllipseMouseListener(drawer) );
                drawer.setCurrentShapeName(getShapeName());
            }
        });
    }
}
