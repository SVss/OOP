package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Line;
import Instruments.Shapes.Point;
import Instruments.Shapes.RectShape;

public class LineMouseListener extends RectShapeMouseListener {

    public LineMouseListener(DrawPanel d) {
        super(d);
    }

    @Override
    protected RectShape createRectShape(Point p1, Point p2) {
        return new Line(p1, p2);
    }
}
