package Instruments.MouseListeners;

import Instruments.DrawPanel;
import Instruments.Shapes.Point;
import Instruments.Shapes.RectShape;

import java.awt.event.MouseEvent;

public abstract class RectShapeMouseListener extends ShapeMouseListener {
    private RectShape rectShape;

    protected RectShapeMouseListener(DrawPanel drawer) {
        this.drawer = drawer;
    }

    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (!isDrawing) {
                isDrawing = true;

                rectShape = createRectShape(new Point(e.getX(), e.getY()), new Point(e.getX(), e.getY()));
                drawer.addShape(rectShape);
            } else {
                isDrawing = false;
            }

        } else if(e.getButton() == MouseEvent.BUTTON3) {
            if (isDrawing) {
                drawer.removeLastShape();
            }
            isDrawing = false;
        }
    }

    public void mouseMoved(MouseEvent e) {
        if (isDrawing) {
            rectShape.setSecondPoint(new Point(e.getX(), e.getY()));
            drawer.replaceLastShape(rectShape);
        }
    }

    public void mouseDragged(MouseEvent e) {
        mouseMoved(e);
    }

    protected abstract RectShape createRectShape(Point p1, Point p2);
}
