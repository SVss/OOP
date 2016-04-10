package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Point;
import Instruments.Shapes.Polygon;
import Instruments.Shapes.PolyShape;

import java.awt.*;

public class PolygonMouseListener extends PolyShapeMouseListener {

    public PolygonMouseListener(DrawPanel d) {
        super(d);
    }

    @Override
    protected PolyShape createPolyShape(Point p) {
        return new Polygon(p);
    }
}
