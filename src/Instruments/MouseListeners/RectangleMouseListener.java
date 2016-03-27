package Instruments.MouseListeners;

import Instruments.DrawPanel;

import Instruments.Shapes.Point;
import Instruments.Shapes.Rectangle;
import Instruments.Shapes.RectShape;


public class RectangleMouseListener extends RectShapeMouseListener {

    public RectangleMouseListener(DrawPanel d) {
        super(d);
    }

    @Override
    protected RectShape createRectShape(Point p1, Point p2) {
        return new Rectangle(p1, p2);
    }
}
