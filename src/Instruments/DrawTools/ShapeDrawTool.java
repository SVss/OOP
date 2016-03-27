package Instruments.DrawTools;

import Instruments.DrawPanel;

import javax.swing.JButton;

public abstract class ShapeDrawTool {
    protected JButton button = new JButton();
    protected DrawPanel drawer;

    ShapeDrawTool(DrawPanel drawer) {
        this.drawer = drawer;
    }

    public abstract JButton getButton();

}
