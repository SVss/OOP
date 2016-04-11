package Instruments.Shapes;

import java.io.Serializable;

public abstract class RectShape extends Shape implements Serializable {
    protected Point firstPoint;
    protected Point secondPoint;

    RectShape(Point start, Point finish) {
        this.firstPoint = start;
        this.secondPoint = finish;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point point) {
        firstPoint = point;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point point) {
        secondPoint = point;
    }

    public int getHeight() {
        return firstPoint.getY() - secondPoint.getY();
    }

    public int getWidth() {
        return firstPoint.getX() - secondPoint.getX();
    }

}
