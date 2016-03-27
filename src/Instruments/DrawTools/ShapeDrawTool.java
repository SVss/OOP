package Instruments.DrawTools;

import Instruments.DrawPanel;

import javax.swing.JButton;

public abstract class ShapeDrawTool {
    protected JButton button = new JButton();
    protected DrawPanel drawer;
    private String shapeName = "Shape_name";

    ShapeDrawTool(DrawPanel drawer, String shapeName) {
        this.drawer = drawer;
        this.button.setText(this.shapeName = shapeName);
    }

    public JButton getButton() {
        return this.button;
    }

    public String getShapeName() {
        return shapeName;
    }
}
