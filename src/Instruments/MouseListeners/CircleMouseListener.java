package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Circle;
import Instruments.Shapes.Point;
import Instruments.Shapes.RectShape;

public class CircleMouseListener extends RectShapeMouseListener {

    public CircleMouseListener(DrawPanel d) {
        super(d);
    }

    @Override
    protected RectShape createRectShape(Point p1, Point p2) {
        return new Circle(p1, p2);
    }
}
