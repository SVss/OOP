package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Point;
import Instruments.Shapes.PolyShape;

import java.awt.event.MouseEvent;

public abstract class PolyShapeMouseListener extends ShapeMouseListener {
    private PolyShape polyShape;

    protected PolyShapeMouseListener(DrawPanel drawer) {
        this.drawer = drawer;
    }

    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (!isDrawing) {
                isDrawing = true;

                polyShape = createPolyShape(new Point(e.getX(), e.getY()));
                polyShape.addPoint(new Point(e.getX(), e.getY()));  // moving point

                drawer.addShape(polyShape);
            } else {
                polyShape.addPoint(new Point(e.getX(), e.getY()));
                drawer.replaceLastShape(polyShape);
            }

        } else if(e.getButton() == MouseEvent.BUTTON3) {
            if (isDrawing) {
                polyShape.removeLastPoint();
                if (polyShape.pointsCount() > 0) {
                    drawer.replaceLastShape(polyShape);
                } else {
                    drawer.removeLastShape();
                }
            }
            isDrawing = false;
        }
    }

    public void mouseMoved(MouseEvent e) {
        if (isDrawing) {
            polyShape.replaceLastPoint(new Point(e.getX(), e.getY()));
            drawer.replaceLastShape(polyShape);
        }
    }

    public void mouseDragged(MouseEvent e) {
        mouseMoved(e);
    }

    protected abstract PolyShape createPolyShape(Point p);
}
