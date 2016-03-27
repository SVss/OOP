package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Ellipse;
import Instruments.Shapes.Point;
import Instruments.Shapes.RectShape;

public class EllipseMouseListener extends RectShapeMouseListener {

    public EllipseMouseListener(DrawPanel d) {
        super(d);
    }

    @Override
    protected RectShape createRectShape(Point p1, Point p2) {
        return new Ellipse(p1, p2);
    }
}
