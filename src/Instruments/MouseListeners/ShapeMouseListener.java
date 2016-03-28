package Instruments.MouseListeners;

import Instruments.DrawPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class ShapeMouseListener extends MouseAdapter{
    protected boolean isDrawing;
    protected DrawPanel drawer;

    public abstract void mousePressed(MouseEvent e);
    public abstract void mouseMoved(MouseEvent e);
    public abstract void mouseDragged(MouseEvent e);
}
