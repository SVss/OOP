package Instruments.DrawTools;

import Instruments.DrawPanel;
import Instruments.MouseListeners.RectangleMouseListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleDrawTool extends ShapeDrawTool {
    public RectangleDrawTool(DrawPanel drawer) {
        super(drawer);

        this.button.setText("Rectangle");
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawer.setMouseListener(new RectangleMouseListener(drawer) );
            }
        });
    }

    @Override
    public JButton getButton() {
        return this.button;
    }
}
