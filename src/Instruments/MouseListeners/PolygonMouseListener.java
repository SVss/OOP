package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Point;
import Instruments.Shapes.PolyLine;
import Instruments.Shapes.PolyShape;

public class PolygonMouseListener extends PolyShapeMouseListener {

    public PolygonMouseListener(DrawPanel d) {
        super(d);
    }

    @Override
    protected PolyShape createPolyShape(Point p) {
        return new PolyLine(p);
    }
}
