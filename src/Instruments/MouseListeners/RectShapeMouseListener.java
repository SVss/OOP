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
            isDrawing = true;

            rectShape = createRectShape(new Point(e.getX(), e.getY()), new Point(e.getX(), e.getY()));
            drawer.addShape(rectShape);

        } else if(e.getButton() == MouseEvent.BUTTON3) {
            if (isDrawing) {
                drawer.removeLastShape();
            }
            isDrawing = false;
            drawer.clearCurrentShapeName();
        }
    }

    public void mouseReleased(MouseEvent e) {
        drawer.setMouseListener(null);
        isDrawing = false;
        drawer.clearCurrentShapeName();
    }

    public void mouseDragged(MouseEvent e) {
        if (isDrawing) {
            rectShape.setSecondPoint(new Point(e.getX(), e.getY()));
            drawer.replaceLastShape(rectShape);
        }
    }

    protected abstract RectShape createRectShape(Point p1, Point p2);
}
